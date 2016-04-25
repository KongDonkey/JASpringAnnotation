package lgs.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import lgs.entity.Book;

@Repository
public class BookDAO {
	@PersistenceContext
	private EntityManager manager;

	public void setFactory(EntityManager manager) {
		this.manager = manager;
	}

	public void insertBook(Book book) {
		manager.persist(book);
	}

	public Book getBookId(int id) {

		return manager.find(Book.class, id);
	}

}
