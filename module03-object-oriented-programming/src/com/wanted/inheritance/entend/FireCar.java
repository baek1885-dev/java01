package com.wanted.inheritance.entend;

public class FireCar extends Car{

    public FireCar(){
        System.out.println("FiraCar의 기본 생성자 호출됨....");
    }


    @Override
    public void soundHorn() {
        if(isRunning()){
            System.out.println("빠아아아아아아아아아앙아아아ㅏ앙ㅇ");
        } else{
            System.out.println("다 비켜어어");
        }
    }

    /* 부모의 것을 가져다 쓸 수도 있고, 본인만의 고유한 필드 or 메서드도 작성 가능하다.*/
    public void sprayWater(){
        System.out.println("불난 곳 발견! 물 발사!");
    }
}
