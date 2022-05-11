package io.github.harutiro.SpringHelloWorld.web.issue;

import lombok.Data;

@Data
public class IssuesForm {
    private  String summary;
    private  String description;
}
