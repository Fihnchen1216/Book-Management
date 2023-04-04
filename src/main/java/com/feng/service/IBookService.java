package com.feng.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.feng.domain.Book;


public interface IBookService extends IService<Book> {

    boolean saveBook(Book book);
    boolean modify(Book book);
    boolean detele(Integer id);

    IPage<Book> getPage(int currentPage, int pageSize);
    IPage<Book> getPage(int currentPage, int pageSize, Book book);

}
