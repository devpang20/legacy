package com.example.app_230822.aticle.repository;

import com.example.app_230822.aticle.dto.Article;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
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

    @Insert("""
            <script>
            INSERT INTO article
            SET createDate = NOW(),
            modifyDate = NOW(),
            subject = #{subject},
            content = #{content}
            </script>
            """)
    void write(@Param("subject") String subject, @Param("content") String content); // 변경
    // void write(String subject, String content); // 기존

    @Select("""
        <script>
        SELECT *
        FROM article
        WHERE id = #{id}
        </script>
        """)
    Article getArticleById(@Param("id") long id); // 변경
    // Article getArticleById(long id); // 기존
}
