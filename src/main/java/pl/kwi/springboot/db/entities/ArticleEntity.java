package pl.kwi.springboot.db.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ARTICLE")
public class ArticleEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
 
    @Column(nullable = false)
    private String title;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dance_type_id")
    private DanceTypeEntity danceType;
    
    
	public ArticleEntity() {
	}
	
	public ArticleEntity(String title) {
		this.title = title;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public DanceTypeEntity getDanceType() {
		return danceType;
	}
	public void setDanceType(DanceTypeEntity danceType) {
		this.danceType = danceType;
	}  	
	

}
