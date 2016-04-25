package lgs.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import lgs.entity.Author;

@Repository
public class AuthorDAO {
	@PersistenceContext
	private EntityManager manager;

	public void setFactory(EntityManager manager) {
		this.manager = manager;
	}

	public void insetAuthor(Author author) {
		manager.persist(author);
	}

	public Author getAuthorId(int id) {

		return manager.find(Author.class, id);
	}

}
