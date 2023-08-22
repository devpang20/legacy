package com.example.app_230822.aticle.controller;

import com.example.app_230822.aticle.dto.Article;
import com.example.app_230822.aticle.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ArticleController {
    private final ArticleService articleService;

    @GetMapping("article/list")
    @ResponseBody
    public String list() {
        List<Article> Articles =  articleService.getArticles();
        return "리스트페이지";
    }
}
