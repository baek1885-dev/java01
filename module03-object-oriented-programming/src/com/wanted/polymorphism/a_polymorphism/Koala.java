package com.wanted.polymorphism.a_polymorphism;

public class Koala extends Animal {

    @Override
    public void eat() {
        System.out.println("코알라가 대나무를 먹습니다.");
    }

    @Override
    public void run() {
        System.out.println("코알라가 뜁니다.");
    }

    @Override
    public void bark() {
        System.out.println("코알코알");
    }

    public void sleep(){
        System.out.println("코알라가 20시간을 잡니다.");
    }
}
