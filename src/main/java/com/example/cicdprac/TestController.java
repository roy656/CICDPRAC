package com.example.cicdprac;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final ArticleService articleService;

    public TestController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("/api/check")
    public String checkTest() {
        return "OK!!!";
    }

    @PostMapping("/api/article")
    public void creatArticle(RequestDto requestDto) {
        articleService.creatArticle(requestDto);
    }

}
