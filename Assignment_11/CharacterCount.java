package com.assignments.java;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount {
	/**
     * It scans a file for the characters 
     * @param args
     * @throws IOException
     */
    public static void main(String args[]) throws IOException {
        String path = "/home/bhavya/";
        String filename = path + args[0];
        File file = new File(filename);
        Scanner sc = new Scanner(file);
        Map<Character, Integer> characters = new HashMap<Character, Integer>();
        String line;
        while (sc.hasNextLine()) {
        	line = sc.nextLine();
        	countCharacters(file,characters,line);
        	
        }
    }
    
    /**
     * It counts the occurrence of characters and adds them into the map.
     * @param file
     * @param characters
     * @param line
     */
    static void countCharacters(File file , Map<Character, Integer> characters , String line) throws IOException {
    	
            
            for (int i = 0; i < line.length(); i++) {
                if (Character.isLetter(line.charAt(i))) {
                    if (characters.containsKey(line.charAt(i)))
                    	characters.put(line.charAt(i), characters.get(line.charAt(i)) + 1);
                    else 
                    	characters.put(line.charAt(i), 1);   
                }
            }
        
        FileWriter fileWriter = new FileWriter("/home/bhavya/count.txt");
        fileWriter.write(characters.toString());                          
        fileWriter.close();
    }
}

