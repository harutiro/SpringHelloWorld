package io.github.harutiro.SpringHelloWorld.domain.issue;

public class IssueEntity {
    private long id;
    private String summary;
    private String description;

    public IssueEntity(long id, String summary, String description) {
        this.id = id;
        this.summary = summary;
        this.description = description;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
