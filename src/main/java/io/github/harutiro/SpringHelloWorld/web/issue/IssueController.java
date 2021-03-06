package io.github.harutiro.SpringHelloWorld.web.issue;

import io.github.harutiro.SpringHelloWorld.domain.issue.IssueEntity;
import io.github.harutiro.SpringHelloWorld.domain.issue.IssueService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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
    public  String showCreationForm(@ModelAttribute IssuesForm form){
//        model.addAttribute("issueForm", new IssuesForm());
        return "issues/creationForm";
    }

    //POST /issues
    @PostMapping("")
    public String create(@Validated IssuesForm form, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            return showCreationForm(form);
        }

        //データの永続化
        issueService.create(form.getSummary(),form.getDescription());

        return "redirect:/issues";
    }


    //Get Localhost:8080/issues/1

    @GetMapping("/{issueId}")
    public String showDetail(@PathVariable("issueId") long issueId ,Model model){
        var dummyEntity = new IssueEntity(1,"概要","説明");
        model.addAttribute("issue" , dummyEntity);

        return "issues/detail";
    }

}
