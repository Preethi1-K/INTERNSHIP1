package com.xworkz.basic.book;
import com.xworkz.basic.book.novel.Novel;
public class BookRunner
    {

        public static void main(String[] args)
        {

            Book book = new Novel();
            Novel novel=(Novel)book;
            novel.read();
            novel.pages();
        }
    }


