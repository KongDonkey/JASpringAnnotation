package lgs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lgs.dao.BookDAO;
import lgs.entity.Book;

@Service
public class BookService {
	private BookDAO bookDao;

	@Autowired
	public BookService(BookDAO bookDao) {
		this.bookDao = bookDao;
	}

	@Transactional
	public void insertBook(String title) {
		Book book = new Book(title);
		bookDao.insertBook(book);
	}

	public Book getBookById(int id) {
		return bookDao.getBookId(id);
	}

}
