package pl.kwi.springboot.commands;

import pl.kwi.springboot.db.entities.ArticleEntity;
import pl.kwi.springboot.db.entities.DanceTypeEntity;

public class HomeCommand {
	
	
	Iterable<DanceTypeEntity> danceTypes;
	DanceTypeEntity selectedDanceType;	
	Iterable<ArticleEntity> articles;
	ArticleEntity selectedArticle;
	
	
	public Iterable<DanceTypeEntity> getDanceTypes() {
		return danceTypes;
	}
	public void setDanceTypes(Iterable<DanceTypeEntity> danceTypes) {
		this.danceTypes = danceTypes;
	}
	
	public DanceTypeEntity getSelectedDanceType() {
		return selectedDanceType;
	}
	public void setSelectedDanceType(DanceTypeEntity selectedDanceType) {
		this.selectedDanceType = selectedDanceType;
	}

	public Iterable<ArticleEntity> getArticles() {
		return articles;
	}
	public void setArticles(Iterable<ArticleEntity> articles) {
		this.articles = articles;
	}	
	
	public ArticleEntity getSelectedArticle() {
		return selectedArticle;
	}
	public void setSelectedArticle(ArticleEntity selectedArticle) {
		this.selectedArticle = selectedArticle;
	}
	

}
