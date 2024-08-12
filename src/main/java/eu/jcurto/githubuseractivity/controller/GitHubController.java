package eu.jcurto.githubuseractivity.controller;

import eu.jcurto.githubuseractivity.model.GitHubUser;
import eu.jcurto.githubuseractivity.services.GithubService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GitHubController {

    private final GithubService githubService;

    public GitHubController(GithubService githubService) {
        this.githubService = githubService;
    }

    @GetMapping("/search")
    public String searchUser(@RequestParam String username, Model model) {
        GitHubUser user = this.githubService.getUser(username);
        model.addAttribute("user", user);
        return "user-details";
    }
}
