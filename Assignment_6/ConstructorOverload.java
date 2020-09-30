package com.assignments.java;


public class ConstructorOverload {
	ConstructorOverload() {
        this("overload");
        System.out.println("In default Constructor");
    }

	ConstructorOverload(String parameter) {
        System.out.println("In another constructor with parameter string " + parameter);
    }

    public static void main(String[] args) {
    	ConstructorOverload overloadingConstructor = new ConstructorOverload();
    }
}