package com.assignments.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class PatternMatch {
    public static void main(String[] args) throws IOException {
        Pattern pattern = Pattern.compile("^[A-Z].*[.]$");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter input");
            if (pattern.matcher(bufferedReader.readLine()).find()) {
                System.out.println("The given input started with capital letter and ended with a period.");
            } 
            else {
                System.out.println("The given statement is invalid");
            }
        }
    }
