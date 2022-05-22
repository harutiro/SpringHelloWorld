package io.github.harutiro.SpringHelloWorld.domain.issue;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IssueService {

    //RequiredArgsCOnstructorのおかげでNewをしなくてもよくなる。
    private final IssueRepository issueRepository;

    //data渡し
    public List<IssueEntity> findAll(){
        return issueRepository.findAll();
    }

    //データを保存する部分
    @Transactional
    public void create(String summary, String description) {
        issueRepository.insert(summary,description);

        //throw new IllegalStateException("NG");
    }
}
