package com.assignments.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateRange {
	/**
     * It takes input such that first line contains no.of test cases .
     * each of the n lines has two dates separated by space, sign-up date and the current date.
     * The dates should be in dd-MM-yyyy format.
     * @param args
     * @throws ParseException
     */
    public static void main(String args[]) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] input = new String[n];
        sc.nextLine();
        for (int i = 0; i < n; i++) 
        	input[i] = sc.nextLine();
        sc.close();

        for (int i = 0; i < n; i++) {
            String[] date = input[i].split(" ");
        Date signupDate = new SimpleDateFormat("dd-MM-yyyy").parse(date[0]);
        Date currentDate = new SimpleDateFormat("dd-MM-yyyy").parse(date[1]);

    	if (signupDate.after(currentDate)) {   						//sign up date cannot be after current date
            System.out.println("No range");
            continue;
        }
    	
        findRange(signupDate,currentDate);
            

    }
}
    
    /**
     * It prints the range of date for the KYC application w.r.t the given sign-up date of KYC and current date on the KYC application
     * @param signUpDate 
     * @param presentDate
     */
    public static void findRange(Date signupDate , Date currentDate) {
    	
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        int year = calendar.get(Calendar.YEAR);
        calendar.setTime(signupDate);
        calendar.set(Calendar.YEAR,year);
        calendar.add(Calendar.DATE, 30);
        Date maxDate = calendar.getTime();
        calendar.add(Calendar.DATE, -60);
        Date minDate = calendar.getTime();
        if (minDate.getTime() <= currentDate.getTime() && currentDate.getTime() <= maxDate.getTime()) 
            System.out.println(sdf.format(minDate) + " " + sdf.format(currentDate));   
        else if (currentDate.getTime() >= maxDate.getTime())
            System.out.println(sdf.format(minDate) + " " + sdf.format(maxDate));	
        else 
            System.out.println("No range");
    }
}
