package pl.kwi.springboot.commands;

import pl.kwi.springboot.db.entities.ArticleEntity;
import pl.kwi.springboot.db.entities.DanceTypeEntity;

public class HomeCommand {
	
	
	private Iterable<DanceTypeEntity> danceTypes;
	private long selectedDanceType;	
	private Iterable<ArticleEntity> articles;
	private long selectedArticle;
	
	
	public Iterable<DanceTypeEntity> getDanceTypes() {
		return danceTypes;
	}
	public void setDanceTypes(Iterable<DanceTypeEntity> danceTypes) {
		this.danceTypes = danceTypes;
	}
	
	public long getSelectedDanceType() {
		return selectedDanceType;
	}
	public void setSelectedDanceType(long selectedDanceType) {
		this.selectedDanceType = selectedDanceType;
	}
	
	public Iterable<ArticleEntity> getArticles() {
		return articles;
	}
	public void setArticles(Iterable<ArticleEntity> articles) {
		this.articles = articles;
	}
	
	public long getSelectedArticle() {
		return selectedArticle;
	}
	public void setSelectedArticle(long selectedArticle) {
		this.selectedArticle = selectedArticle;
	}
		

}
