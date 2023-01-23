package com.iitgl320222023.gestionboutique.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iitgl320222023.gestionboutique.model.Article;
import com.iitgl320222023.gestionboutique.service.ArticleService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class ArticleController {
	
	@Autowired
	public ArticleService articleService;
	
	@RequestMapping(value = "/articles", method = RequestMethod.GET)
	public List<Article> getAllArticles() {
		
		List<Article> articles = new ArrayList<>();
	
		try {
			articles = this.articleService.getAll();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erreur " + e.getMessage());
		}
		
		return articles;
		
	}
	
	@RequestMapping(value = "/article/{id}", method = RequestMethod.GET)
	public Article getOneArticle(@PathVariable int id) {
		
		Article article = new Article();
		
		try {
			  article = this.articleService.findById(id);
		} catch (Exception e) {
			System.out.println("Erreur " + e.getMessage());
		}
		
		return article;
	}
	
	@RequestMapping(value = "/code", method = RequestMethod.GET)
	public Article findByCode(@PathVariable String code) {
		
		Article article = new Article();
		try {
			article = this.articleService.findByCode(code);
		} catch (Exception e) {
			System.out.println("Erreur " + e.getMessage());
		}
		return article;
	}
	
	@RequestMapping(value = "/{code}/{designation}", method = RequestMethod.GET)
	public Article findByCodeAndDesignation(@PathVariable String code, @PathVariable String designation) {
		
		Article article = new Article();
		
		try {
			article = this.articleService.findByCodeAndDesignation(code, designation);
		} catch (Exception e) {
			System.out.println("Erreur " + e.getMessage());
		}
		
		return article;
	}
	
	@RequestMapping(value = "/article/ajouter", method = RequestMethod.POST, headers = "accept=Application/json")
	public Article saveArticle(@RequestBody Article article) {
		
	    try {
			article = this.articleService.save(article);
		} catch (Exception e) {
			System.out.println("Erreur " + e.getMessage());
		}
	    
	    return article;
	}
	
	@RequestMapping(value = "/article/modifier/{id}", method = RequestMethod.PUT, headers = "accept=Application/json")
	public Article updateArticle(@RequestBody Article article, @PathVariable  int id) {
		
		try {
			article = this.articleService.update(article);
		} catch (Exception e) {
			System.out.println("Erreur " + e.getMessage());
		}
	    
	    return article;

	}
	
	@RequestMapping(value = "/article/supprimer/{id}", method = RequestMethod.DELETE, headers = "accept=Application/json")
	public void deleteArticle(@PathVariable Integer id) {
	    this.articleService.deleteById(id);
	}
	    
}

