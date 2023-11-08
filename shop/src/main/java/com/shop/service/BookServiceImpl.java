package com.shop.service;

import com.shop.entity.Book;
import com.shop.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public int bookAdd(Book book) {
        return bookMapper.bookAdd(book);
    }

    @Override
    public List<Book> bookAllList() {
        return bookMapper.bookAllList();
    }

    @Override
    public Book bookDetail(Long seq) {
        return bookMapper.bookDetail(seq);
    }
}