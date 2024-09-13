package com.spring.github_cicd_actions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCicdActionsApplication {
	@GetMapping("/welcome")
public String welcome(){
	return "welocme to github" ;

}
	//git init
	//git add README.md
	//git commit -m "first commit"
	//git branch -M main
	//git remote add origin https://github.com/ranik09/github-actions-example.git
	//git push -u origin main

	public static void main(String[] args) {
		SpringApplication.run(GithubCicdActionsApplication.class, args);
	}

}
