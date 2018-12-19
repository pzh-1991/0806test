package com.offcn.crm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.offcn.crm.dao.BookDao;

@Service
@Transactional
public class BookService {
	@Autowired
	private BookDao bookDao;
	public void buyBook(String isbn,String username) {
		double price = bookDao.getBookPriceByIsbn(isbn);
		bookDao.updateBookStockByIsbn(isbn);
		bookDao.updateBalanceByUsername(username, price);
		
	}
}
