package com.iitgl320222023.gestionboutique.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iitgl320222023.gestionboutique.model.Article;

@Service
public interface ArticleService {
	
	public List<Article> getAll();
	
	public Article findById(Integer id);
	
	public Article findByCode(String code);
    
    public Article findByCodeAndDesignation(String code, String designation);
    
	public Article save(Article article);
	
	public Article update(Article article);
	
	public void deleteById(Integer id);
	
}
