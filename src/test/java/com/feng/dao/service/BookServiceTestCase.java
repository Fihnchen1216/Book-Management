package com.feng.dao.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.feng.domain.Book;
import com.feng.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTestCase {
    @Autowired
    private BookService bookService;

    @Test
    void testGetById(){
        System.out.println(bookService.getById(5));
    }
    @Test
    void testSave(){
        Book book = new Book();
        book.setType("Test123");
        book.setName("Test123");
        book.setDescription("Test123");
        bookService.save(book);
    }
    @Test
    void testUpdate(){
        Book book = new Book();
        book.setId(4);
        book.setType("Testabc");
        book.setName("Testabc");
        book.setDescription("Testabc");
        bookService.update(book);
    }
    @Test
    void testDelete(){
        bookService.delete(4);
    }
    @Test
    void testGetAll(){
        bookService.getAll();
    }
    @Test
    void testGetPage(){
        IPage<Book> page = bookService.getPage(2, 5);
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getPages());
        System.out.println(page.getTotal());
        System.out.println(page.getRecords());
    }

}
