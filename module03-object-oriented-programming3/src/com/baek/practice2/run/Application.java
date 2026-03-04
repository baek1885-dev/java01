package com.baek.practice2.run;

import com.baek.practice2.dto.BookDTO;

public class Application {


    public static void main(String[] args) {

        BookDTO book = new BookDTO();
        BookDTO book2 = new BookDTO();

        book.setprice(20000);
        book.setTitle("자바의정석");
        book.setAuthor("윤창섭");
        book.setDiscountRate(0.5);

        System.out.println(book.toString());

        book2.setprice(20);
        book2.setDiscountRate(0.3);
        book2.setAuthor("승재");
        book2.setTitle("자바");

        System.out.println(book2.toString());

        System.out.println("할인된 가격 :" + (book.getPrice() - book.getPrice()*book.getDiscountRate()));


    }
}
