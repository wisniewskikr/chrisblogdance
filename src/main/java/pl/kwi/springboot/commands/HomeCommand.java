package pl.kwi.springboot.commands;

import pl.kwi.springboot.db.entities.ArticleEntity;
import pl.kwi.springboot.db.entities.DanceTypeEntity;

public class HomeCommand {
	
	
	private Iterable<DanceTypeEntity> danceTypes;
	private String selectedDanceType;	
	private Iterable<ArticleEntity> articles;
	private String selectedArticle;
	
	
	public Iterable<DanceTypeEntity> getDanceTypes() {
		return danceTypes;
	}
	public void setDanceTypes(Iterable<DanceTypeEntity> danceTypes) {
		this.danceTypes = danceTypes;
	}
	
	public String getSelectedDanceType() {
		return selectedDanceType;
	}
	public void setSelectedDanceType(String selectedDanceType) {
		this.selectedDanceType = selectedDanceType;
	}
	
	public Iterable<ArticleEntity> getArticles() {
		return articles;
	}
	public void setArticles(Iterable<ArticleEntity> articles) {
		this.articles = articles;
	}
	
	public String getSelectedArticle() {
		return selectedArticle;
	}
	public void setSelectedArticle(String selectedArticle) {
		this.selectedArticle = selectedArticle;
	}	
	

}
