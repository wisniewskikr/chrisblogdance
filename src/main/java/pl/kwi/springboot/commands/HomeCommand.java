package pl.kwi.springboot.commands;

import java.util.ArrayList;
import java.util.List;

import pl.kwi.springboot.db.entities.ArticleEntity;
import pl.kwi.springboot.db.entities.DanceTypeEntity;

public class HomeCommand {
	
	
	private Iterable<DanceTypeEntity> danceTypes;
	private List<Long> selectedDanceTypes = new ArrayList<Long>();	
	private Iterable<ArticleEntity> articles;
	private long selectedArticle;
	
	
	public Iterable<DanceTypeEntity> getDanceTypes() {
		return danceTypes;
	}
	public void setDanceTypes(Iterable<DanceTypeEntity> danceTypes) {
		this.danceTypes = danceTypes;
	}	
	
	public List<Long> getSelectedDanceTypes() {
		return selectedDanceTypes;
	}
	public void setSelectedDanceTypes(List<Long> selectedDanceTypes) {
		this.selectedDanceTypes = selectedDanceTypes;
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
