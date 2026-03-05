package com.wanted.a_generic.b_use.run;

import com.wanted.a_generic.b_use.*;

public class Application02 {

    public static void main(String[] args) {
        /* comment 와일드 카드
        *   제네릭 클래스 타입의 객체를 메소드의 매개변수로
        *   전달 받을 때, 그 객체의 타입 변수를 제한할 수 있다.
        *   <?> : 제한 없음
        *   <? extends Type> : 와일드카드 상한 제한
        *   <? super Type> : 와일드카드 하한 제한
        *   <? extends Student> = Student 와 자식클래스까지 대체 가능
            <? super Worker> = Worker와 부모클래스까지 대체 가능
            <?> = 모든 타입으로 대체 가능 */

        WIldcardFarm wfarm = new WIldcardFarm();

        //Rabbit rabbit = new Rabbit();
        //RabbitFarm<Rabbit> rfarm = new RabbitFarm<>(rabbit);
        //wfarm.anyType(rfarm);
        // 이 객체 생성하는 과정을 합치면 아래와 같음.

        // 레빗 객체를 만들고 레빗 팜 객체에 넣음
        wfarm.anyType(new RabbitFarm<Rabbit>(new Rabbit()));
        wfarm.anyType(new RabbitFarm<Bunny>(new Bunny()));
        wfarm.anyType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        System.out.println("================================");
        //wfarm.extendsType(new RabbitFarm<Rabbit>(new Rabbit()));
        wfarm.extendsType(new RabbitFarm<Bunny>(new Bunny()));
        wfarm.extendsType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        System.out.println("================================");
        wfarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
        wfarm.superType(new RabbitFarm<Bunny>(new Bunny()));
        //wfarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        // 레빗 객체를 만들고 레빗팜에 넘김.




    }
}
