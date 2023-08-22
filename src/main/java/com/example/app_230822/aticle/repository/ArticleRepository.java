package com.example.app_230822.aticle.repository;

import com.example.app_230822.aticle.dto.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ArticleRepository {
    @Select("""
            <script>
                SELECT * 
                FROM article
            </script>            
            """)
    List<Article> getArticles();
}
