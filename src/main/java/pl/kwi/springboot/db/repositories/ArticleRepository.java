package pl.kwi.springboot.db.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import pl.kwi.springboot.db.entities.ArticleEntity;

public interface ArticleRepository extends CrudRepository<ArticleEntity, Long> {
	
	@Query("SELECT a FROM ArticleEntity a WHERE a.danceType.id = :danceTypeId")
    public List<ArticleEntity> findByDanceTypeId(@Param("danceTypeId") long danceTypeId);
	
}
