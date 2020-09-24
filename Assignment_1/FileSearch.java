package com.assignments.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class FileSearch {

    /**
     * The program searches through the home directory and looks for files that match a regular expression 
     * and prints out the file name and its path.
     * It takes the regular expression repeatedly as input.
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        File file = new File("/home");
        Map<String, String> homeDirectoryMap = new HashMap<String, String>();
        getAllFiles(file, homeDirectoryMap);

        while (true) {
        	AtomicInteger counter = new AtomicInteger();
            System.out.println("Enter the regular expression ");
            String regex = bufferedReader.readLine();

            try {
                Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
                homeDirectoryMap.forEach((fileName, filePath) -> {
                    if (pattern.matcher((String) fileName).find()) {
                        System.out.println("File name is "+fileName +" and path is "+filePath);
                        counter.getAndIncrement();
                    }
                    
                });
            } 
            catch (PatternSyntaxException e) {
                System.out.println("Given Regular Expression is incorrect");
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
            if(counter.get() == 0)
            	System.out.println("file with given regular expression is not found");
        }
    }

    /**
     * It adds the key as the file name and value as absolute file path
     *
     * @param file 
     * @param homeDirectoryMap     
     */
    static void getAllFiles(File file, Map homeDirectoryMap) {
        if (file == null)
            return;

        if (file.isFile()) {
        	homeDirectoryMap.put(file.getName(),file.getAbsolutePath());
            return;
        }

        File[] filesOrDirectories = file.listFiles();
        if (filesOrDirectories != null)
            for (File fileOrDirectory : filesOrDirectories) {
            	getAllFiles(fileOrDirectory, homeDirectoryMap);
            }
    }

}