package com.shop.service;

import com.shop.entity.Book;

import java.util.List;

public interface BookService {

    public int bookAdd(Book book);
    public List<Book> bookAllList();
    public Book bookDetail(Long seq);

}