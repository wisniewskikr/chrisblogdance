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
	private List<Integer> pages;
	private int currentPage = 1;
	private boolean disablePrevious;
	private boolean disableNext;
	
	
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
	
	public List<Integer> getPages() {
		return pages;
	}
	public void setPages(List<Integer> pages) {
		this.pages = pages;
	}
	
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	
	public boolean isDisablePrevious() {
		return disablePrevious;
	}
	public void setDisablePrevious(boolean disablePrevious) {
		this.disablePrevious = disablePrevious;
	}
	
	public boolean isDisableNext() {
		return disableNext;
	}
	public void setDisableNext(boolean disableNext) {
		this.disableNext = disableNext;
	}
	

}
