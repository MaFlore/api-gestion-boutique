package com.iitgl320222023.gestionboutique.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iitgl320222023.gestionboutique.model.Article;
import com.iitgl320222023.gestionboutique.repository.ArticleRepository;
import com.iitgl320222023.gestionboutique.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService{
	
	@Autowired
	public ArticleRepository articleRepository;
	
	@Override
	public List<Article> getAll(){
		return this.articleRepository.findAll();
	}
	
	@Override
	public Article findById(Integer id) {
        return this.articleRepository.findById(id).orElse(null);
    }
	
	@Override
	public Article findByCode(String code) {
		return this.articleRepository.findByCode(code);
	}

	@Override
	public Article findByCodeAndDesignation(String code, String designation) {
		return this.articleRepository.findByCodeAndDesignation(code, designation);
	}
	
	@Override
	public Article save(Article article){
		return this.articleRepository.save(article);
	}
	
	@Override
	public Article update(Article article) {
        return this.articleRepository.save(article);
    }
	
	@Override
	public void deleteById(Integer id) {
		this.articleRepository.deleteById(id);
	}

}

