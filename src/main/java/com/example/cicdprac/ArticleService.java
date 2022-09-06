package com.example.cicdprac;


import org.springframework.stereotype.Service;

@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public void creatArticle(RequestDto requestDto) {
        Article article = new Article(requestDto);
        articleRepository.save(article);
    }
}
