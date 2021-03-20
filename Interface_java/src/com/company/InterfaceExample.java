package com.company;

interface Int{


    default void A1(float a, float b) {
        System.out.println(a*b*2);
    }
}

class Square implements Int{
    public float Area(float a, float b)
    {
        return a*b;
    }
}

class Rect implements Int{
    public float Area(float a, float b)
    {
        return a/b;
    }
}
public class InterfaceExample {
    public static void main(String[] args)
    {
        Rect obj1 = new Rect();
        System.out.println(obj1.Area(5,10));
        Square obj2 = new Square();
        System.out.println(obj2.Area(10,5));
        obj1.A1(3, 5);
        obj2.A1(4, 8);
    }
}
