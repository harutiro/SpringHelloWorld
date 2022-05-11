package io.github.harutiro.SpringHelloWorld.domain.issue;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//マエバティスからDBにアクセスできる
@Mapper
public interface IssueRepository {

    @Select("select * from issues")
    List<IssueEntity> findAll();

}
