package com.training.assignment7;


public class InnerClass {
    public static void main(String[] args) {
    	OuterclassOne outerclassOne = new OuterclassOne();
        OuterclassTwo outerclassTwo = new OuterclassTwo();
        

        OuterclassTwo.InnerclassTwo innerclassTwo = outerclassTwo.new InnerclassTwo(outerclassOne);
    }
}

class OuterclassOne {
    class InnerclassOne {
        InnerclassOne(String argument) {
            System.out.println("In Inner Class One with string:" + argument);
        }
    }
}

class OuterclassTwo {
    class InnerclassTwo extends OuterclassOne.InnerclassOne {
        InnerclassTwo(OuterclassOne outerclassOne) {
            outerclassOne.super("from inner class two");
            System.out.println("In Inner Class Two");
        }

    }
}