package pl.kwi.springboot.db.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import pl.kwi.springboot.db.entities.ArticleEntity;

public interface ArticleRepository extends PagingAndSortingRepository<ArticleEntity, Long> {
	
	@Query("SELECT a FROM ArticleEntity a WHERE a.danceType.id IN (:danceTypeIds)")
    public List<ArticleEntity> findByDanceTypeIds(@Param("danceTypeIds") List<Long> danceTypeIds);
	
}
