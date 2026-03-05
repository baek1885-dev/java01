package com.wanted.a_generic.b_use;

public class WIldcardFarm {


    // farm은 매개변수 이름. 레빗팜에 있는 아무거나 받아서 farm 변수에 넣음. 여기서는
    // 레빗을 넣음
    public void anyType(RabbitFarm<?> farm){
        farm.getAnimal().cry();
    }

    // 버니와 버니 자식클래스만 가능. 버니, 드렁크버니
    public void extendsType(RabbitFarm<? extends Bunny> farm) {
        farm.getAnimal().cry();
    }

    public void superType(RabbitFarm<? super Bunny> farm){
        farm.getAnimal().cry();
    }

}
