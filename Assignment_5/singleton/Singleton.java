package bhavya.assignment.singleton;

public class Singleton {
    String str;

    /**
     * this method creates an object for Singleton class and returns it
     * @param var
     * @return st
     */
    public static Singleton staticMethod(String var){
    	//cannot access a non-static variable from a static method without an instance
        //str=var;	
    	Singleton singleton=new Singleton();
    	singleton.str=var;
        return singleton;
    }

    /**
     * prints the global variable
     */
    public void nonStaticMethod(){
        System.out.println(str);
    }
}
