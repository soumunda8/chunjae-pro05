package com.shop.mapper;

import com.shop.entity.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {

    int bookAdd(Book book);
    List<Book> bookAllList();
    Book bookDetail(Long seq);

}