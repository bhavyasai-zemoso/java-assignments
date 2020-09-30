package com.training.assignment7;

class CycleFactory {
    public static void main(String[] args) {
        CycleInterface unicycle = UnicycleFactory.getUnicycle();
        unicycle.cycleType();
        CycleInterface bicycle = BicycleFactory.getBicycle();
        bicycle.cycleType();
        CycleInterface tricycle = TricycleFactory.getTricycle();
        tricycle.cycleType();
    }
}

interface CycleInterface {
    void cycleType();
}

class Unicycle implements CycleInterface {
    Unicycle() {
        System.out.println("unicycle constructor");
    }

    public void cycleType() {
        System.out.println("this is unicycle");
    }
}


class Bicycle implements CycleInterface {
    Bicycle() {
        System.out.println("bicycle constructor");
    }

    public void cycleType() {
        System.out.println("this is bicycle");
    }
}

class Tricycle implements CycleInterface {
    Tricycle() {
        System.out.println("tricycle constructor");
    }

    public void cycleType() {
        System.out.println("this is tricycle");
    }
}

class UnicycleFactory {
    public static Unicycle getUnicycle() {
        return new Unicycle();
    }
}

class BicycleFactory {
    public static Bicycle getBicycle() {
        return new Bicycle();
    }
}


class TricycleFactory {
    public static Tricycle getTricycle() {
        return new Tricycle();
    }
}

