package pl.kwi.springboot.commands;

import pl.kwi.springboot.db.entities.ArticleEntity;

public class ArticleCommand {
	
	
	private ArticleEntity article;
	
	
	public ArticleEntity getArticle() {
		return article;
	}
	public void setArticle(ArticleEntity article) {
		this.article = article;
	}
	
			

}
