package pl.kwi.springboot.db.repositories;

import org.springframework.data.repository.CrudRepository;

import pl.kwi.springboot.db.entities.ArticleEntity;

public interface ArticleRepository extends CrudRepository<ArticleEntity, Long> {
	
}
