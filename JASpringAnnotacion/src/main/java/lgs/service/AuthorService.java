package lgs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lgs.dao.AuthorDAO;
import lgs.entity.Author;

@Service
public class AuthorService {
	private AuthorDAO authorDAO;
	@Autowired
	public AuthorService(AuthorDAO authorDAO) {
		this.authorDAO = authorDAO;
	}
	
	@Transactional
	public void insertAuthor(String name){
		Author author = new Author(name);
		authorDAO.insetAuthor(author);
	}
	
	public Author getAuthorById(int id){
		return authorDAO.getAuthorId(id);
	}
	
	
	
}
