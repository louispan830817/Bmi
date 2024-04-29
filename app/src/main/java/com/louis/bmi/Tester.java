package com.louis.bmi;

import com.louis.bmi.value.Person;
import com.louis.bmi.value.Student;

public class Tester {
    public static void main(String[] args) {
//        System.out.println("hello world");
        Student stu = new Student("001","louis",80,90);
        stu.print();
       Person person = new Person();
       person.hello();
       person.hello("louis");
       person.setWeight(70);
       person.setHeight(1.75f);
       System.out.println(person.bmi());
    }
}
