package com.example.app_230822.aticle.service;

import com.example.app_230822.aticle.dto.Article;
import com.example.app_230822.aticle.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;

    public List<Article> getArticles() {
        return articleRepository.getArticles();
    }

    public Article getArticleById(Long id) {
        Article article = this.articleRepository.getArticleById(id);

        return article;
    }
}
