package com.offcn.crm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao {
	@Autowired
	private JdbcTemplate template;
	//根据isbn查书价
	//根据isbn更新库存
	//根据用户名修改账号余额
	public double getBookPriceByIsbn(String isbn) {
		String sql = "select price from book where isbn=?";
		return template.queryForObject(sql, Double.class,isbn);
	}
	public boolean updateBookStockByIsbn(String isbn) {
		String sql = "update book_stock set stock = stock -1 where isbn = ?";
		int update = template.update(sql,isbn);
		return update == 1;
	}
	public boolean updateBalanceByUsername(String username,double price) {
		String sql = "update account set balance = balance - ? where username = ?";
		int update = template.update(sql,price,username);
		return update ==1;
	}
}
