package io.github.harutiro.SpringHelloWorld.web.issue;

import io.github.harutiro.SpringHelloWorld.domain.issue.IssueEntity;
import io.github.harutiro.SpringHelloWorld.domain.issue.IssueService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IssueController {

    private final IssueService issueService = new IssueService();

    // GET // issues
    @GetMapping("/issues")
    public String showList(Model model){

        model.addAttribute("issueList",issueService.findAll());
        return "issues/list";
    }
}
