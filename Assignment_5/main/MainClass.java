package bhavya.assignment.main;

import bhavya.assignment.data.Variables;
import bhavya.assignment.singleton.Singleton;

public class MainClass {
    /**
     * this main method creates object of first class and calls both the methods in first class
     * calls static method of second class which returns object of second class using the object calls non static method
     * of second class
     * @param args
     */
    public static void main(String args[]){
        Variables variable=new Variables();
        variable.printDefaultClassVariables();
        variable.printDefaultLocalVariables();
        Singleton singleton=Singleton.staticMethod("Harry");
        singleton.nonStaticMethod();

    }
}
