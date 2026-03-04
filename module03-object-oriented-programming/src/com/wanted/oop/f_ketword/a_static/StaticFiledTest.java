package com.wanted.oop.f_ketword.a_static;

public class StaticFiledTest {

    private int nonStaticCount;
    private static int staticCount;

    // 기본 생성자
    public StaticFiledTest(){}

    public int getNonStaticCount() {
        return nonStaticCount;
    }

    public static int getStaticCount() {
        return staticCount;
    }

    /*각 필드를 호출 시 마다 1씩 증가시키는 용도의 메소드*/
    public void increaseNonStatic(){
        this.nonStaticCount++;
    }

    // static이 붙은 녀석은 힙 메모리 공간에 있는게 아닌 메소드 에리어에 있는 거임
    public void increaseStatic(){
        // 클래스명.변수명
        StaticFiledTest.staticCount++;
    }
}
