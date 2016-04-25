package lgs.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lgs.dao.AuthorDAO;
import lgs.entity.Author;

@Service
public class AuthorService {
	private AuthorDAO authorDao;

	@Autowired
	public AuthorService(AuthorDAO authorDao) {
		this.authorDao = authorDao;
	}

	@Transactional
	public void insertAuthor(String name) {
		Author author = new Author(name);
		authorDao.insertAuthor(author);
	}

	public Author getAuthorById(int id) {
		return authorDao.getAuthorId(id);
	}

}
