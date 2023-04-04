package com.feng.dao.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.feng.domain.Book;
import com.feng.service.BookService;
import com.feng.service.IBookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTest {
    @Autowired
    private IBookService bookService;

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
        bookService.updateById(book);
    }
    @Test
    void testDelete(){
        bookService.removeById(4);
    }
    @Test
    void testGetAll(){
        bookService.list();
    }
    @Test
    void testGetPage(){
        IPage<Book> page = new Page<>(2,5);
        bookService.page(page);
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getPages());
        System.out.println(page.getTotal());
        System.out.println(page.getRecords());
    }

}
