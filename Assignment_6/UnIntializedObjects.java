package com.assignments.java;

public class UnIntializedObjects {
	
	UnIntializedObjects(String str) {
		
        System.out.println(str);
	}

    public static void main(String[] args) {

        //It will not print the messages as only references are created
    	
    	UnIntializedObjects unInitializedObjects[] = new UnIntializedObjects[4];
    	
    }
}