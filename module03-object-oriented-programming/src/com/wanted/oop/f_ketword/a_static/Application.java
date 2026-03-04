package com.wanted.oop.f_ketword.a_static;

public class Application {

    public static void main(String[] args) {

        /*comment. static 키워드에 대해 알아보자.*/

        // 객체 생성 구문
        StaticFiledTest st1 = new StaticFiledTest();

        System.out.println("non-static 변수 확인: " + st1.getNonStaticCount());
        System.out.println("static 변수 확인: " + st1.getStaticCount());

        // 각 변수를 1씩 증가시키는 구문
        st1.increaseNonStatic();
        st1.increaseStatic();

        System.out.println("non-static 변수 확인: " + st1.getNonStaticCount());
        System.out.println("static 변수 확인: " + st1.getStaticCount());

        /*comment 핵심 포인트
        *   새로운 StaticFieldTest 객체를 생성
        *   sout 구문을 실행했을 때 0과 0이 나오는 것을 기대했지만,
        *   실제로 static 키워드가 붙은 변수는 1이 출력되었다.
        *   */

        // static은 메소드 에리어에 따로 있음
        StaticFiledTest st2 = new StaticFiledTest();
        System.out.println("non-static 변수 확인: " + st2.getNonStaticCount());
        System.out.println("static 변수 확인: " + st2.getStaticCount());

    }

}
