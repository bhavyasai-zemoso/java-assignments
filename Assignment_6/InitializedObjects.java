package com.assignments.java;

public class InitializedObjects {
	
	InitializedObjects(String str) {
		
        System.out.println(str);
    }

    public static void main(String[] args) {
    	InitializedObjects initializedObjects[] = new InitializedObjects[4];
    	for (int i = 0; i < 4; i++) {
    		initializedObjects[i] = new InitializedObjects("hello");
    	}
    }
}
