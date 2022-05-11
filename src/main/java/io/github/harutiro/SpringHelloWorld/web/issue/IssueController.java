package io.github.harutiro.SpringHelloWorld.web.issue;

import io.github.harutiro.SpringHelloWorld.domain.issue.IssueEntity;
import io.github.harutiro.SpringHelloWorld.domain.issue.IssueService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/issues")
@RequiredArgsConstructor
public class IssueController {

    private final IssueService issueService;

    // GET // issues
    @GetMapping("")
    public String showList(Model model){

        model.addAttribute("issueList",issueService.findAll());
        return "issues/list";
    }

    //GET /issues/creationForm
    @GetMapping("/creationForm")
    public  String showCreationForm(){
        return "issues/creationForm";
    }
}
