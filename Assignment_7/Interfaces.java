package com.training.assignment7;

interface Interface1 {
    void interface1_method1();

    void interface1_method2();
}

interface Interface2 {
    void interface2_method1();

    void interface2_method2();

}

interface Interface3 {
    void interface3_method1();

    void interface3_method2();
}

interface Interface4 extends Interface1, Interface2, Interface3 {
    void interface4_method();
}

public class Interfaces {
    public static void main(String arg[]) {
        Base base = new Base();
        base.fetchInterface1(base);
        base.fetchInterface2(base);
        base.fetchInterface3(base);
        base.fetchInterface4(base);
    }
}

class ConcreteClass {
	ConcreteClass() {
        System.out.println("Inside concrete class");
    }

}


class Base extends ConcreteClass implements Interface4 {

    void fetchInterface1(Interface1 base) {
    	base.interface1_method1();
    	base.interface1_method2();
    }

    void fetchInterface2(Interface2 base) {
    	base.interface2_method1();
    	base.interface2_method2();
    }

    void fetchInterface3(Interface3 base) {
    	base.interface3_method1();
        base.interface3_method2();
    }

    void fetchInterface4(Interface4 base) {
    	base.interface4_method();
    }

    @Override
    public void interface1_method1() {
        System.out.println("Inside interface 1 method 1");
    }

    @Override
    public void interface1_method2() {
        System.out.println("Inside interface 1 method 2");

    }

    @Override
    public void interface2_method1() {
        System.out.println("Inside interface 2 method 1");

    }

    @Override
    public void interface2_method2() {
        System.out.println("Inside interface 2 method 2");

    }

    @Override
    public void interface3_method1() {
        System.out.println("Inside interface 3 method 1");

    }

    @Override
    public void interface3_method2() {
        System.out.println("Inside interface 3 method 2");
    }

    @Override
    public void interface4_method() {
        System.out.println("Inside interface 4 method");
    }
}