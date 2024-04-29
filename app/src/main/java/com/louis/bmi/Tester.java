package com.louis.bmi;

public class Tester {
    public static void main(String[] args) {
//        System.out.println("hello world");
       Person person = new Person();
       person.hello();
       person.hello("louis");
       person.weight = 75;
       person.height = 1.75f;
       System.out.println(person.bmi());
    }
}
