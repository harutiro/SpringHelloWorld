package io.github.harutiro.SpringHelloWorld.web.issue;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class IssuesForm {
    @NotBlank
    @Size(max=256)
    private  String summary;

    @NotBlank
    @Size(max=256)
    private  String description;
}
