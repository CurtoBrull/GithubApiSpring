package eu.jcurto.githubuseractivity.services;

import eu.jcurto.githubuseractivity.model.GitHubUser;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class GithubService {

    private final WebClient webClient;

    public GithubService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder
                .baseUrl("https://api.github.com")
                .build();
    }

    public GitHubUser getUser(String username) {
        try{
            return this.webClient.get()
                    .uri("/users/{username}", username)
                    .retrieve()
                    .bodyToMono(GitHubUser.class)
                    .block();
        } catch (Exception e) {
            throw new RuntimeException("Error retrieving user data", e);
        }
    }
}
