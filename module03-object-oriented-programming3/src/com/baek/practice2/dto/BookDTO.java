package com.baek.practice2.dto;

public class BookDTO {


    private String title;
    private int price;
    private double discountRate;
    private String author;

    public void setTitle(String title){
        this.title = title;
    }
    public void setprice(int price){
        this.price = price;
    }
    public void setDiscountRate(double discountRate){
        this.discountRate = discountRate;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public int getPrice(){
        return price;
    }
    public double getDiscountRate(){
        return discountRate;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", discountRate=" + discountRate +
                ", author='" + author + '\'' +
                '}';
    }


}
