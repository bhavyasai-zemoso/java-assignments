package com.assignments.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PingHost {

    /**
     * It takes host address as input and
     * prints out the median of time taken to ping the given host address
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a host address:");
            String host = bufferedReader.readLine();
            System.out.println(findMedian(host));

    }

    /**
     * It prints the median of time taken to ping the given host using the system utility command 'ping'.
     * It finds the median from the given list of time taken
     * @param host
     * @return median
     */
    public static Float findMedian(String host) {
        Runtime runtime = Runtime.getRuntime();
        String pingCommand = "ping " + host + " -c 10";
        Float median=0.0f;
        try {
            Process process = runtime.exec(pingCommand);

            BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String output;
            List<Float> packet = new ArrayList<Float>();
            while ((output = input.readLine()) != null) {
                int timeIndex = output.indexOf("time=");
                if (timeIndex != -1) {
                	packet.add(Float.parseFloat(output.substring(timeIndex + 5, output.lastIndexOf("ms") - 1)));
                }
            }

            int size = packet.size();
            
            if (size == 0) {
                System.out.println("Given host address does not exist or unreachable");
                System.exit(0);
            }
            
            Collections.sort(packet);
            
            if (size % 2 == 0)
                median= ((Float) packet.get(size / 2) + (Float) packet.get(size / 2 - 1)) / 2;
            else
            	median = (Float) packet.get(size / 2);
            
        } 
        catch (Exception ex) {
            System.out.println("Given host address does not exist or unreachable");
        }
        return median;
    }
}