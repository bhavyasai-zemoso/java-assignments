package com.assignments.java;

import java.util.*;

 // Time complexity:  o(n) 
 // Space complexity: o(n) 
 
public class CheckAlphabets {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        input = input.toLowerCase(); 
        int n=input.length();
        Set<Character> hs = new HashSet<Character>(); //using set to avoid duplicates
        for (int i = 0; i < n; i++) {
            if (Character.isLetter(input.charAt(i))) {     
                hs.add(input.charAt(i));
            }
        }
        if (hs.size() == 26) {                              
            System.out.println("contains all the letters of the alphabet a-z");
        } else {
            System.out.println("does not contain all the letters of the alphabet a-z");
        }
    }
}