package com.iitgl320222023.gestionboutique.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iitgl320222023.gestionboutique.model.Article;

public interface ArticleRepository extends JpaRepository <Article, Integer> {

    public Article findByCode(String code);
    
    public Article findByCodeAndDesignation(String code, String designation);
}
