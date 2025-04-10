package com.xworkz.basic.book;
import com.xworkz.basic.book.novel.Novel;
public class BookRunner
    {

        public static void main(String[] args)
        {

            Book book = new Book();
            book.read();
            book.pages();

            Novel novel = new Novel();
            novel.read();
            novel.pages();
        }
    }


