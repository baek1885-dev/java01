package com.wanted.b_collection.a_list.dto;

public class BookDTO {

    // comment. 기본생성자, 필드 초기 생성자, 게터와 세터, toString 이 4개는 필수!!

    private int no;
    private String title;
    private String author;
    private int price;

    //기본생성자
    public BookDTO() {}

    //모든 필드를 초기화하는 생성자
    public BookDTO(int no, String title, String author, int price) {
        this.no = no;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // 게터와 세타
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "no=" + no +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
