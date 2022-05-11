package io.github.harutiro.SpringHelloWorld.domain.issue;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//マエバティスからDBにアクセスできる
@Mapper
public interface IssueRepository {

    @Select("select * from issues")
    List<IssueEntity> findAll();

    //dataをDBに追加する。
    @Insert("insert into issues (summary,description) values (#{summary}, #{description})")
    void insert(String summary, String description);
}
