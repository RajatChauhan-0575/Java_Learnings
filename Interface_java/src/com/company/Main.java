package com.company;
interface printable{
    void print();
}

class A implements printable{
    public void print(){System.out.println("Hello");}
}
public class Main {

    public static void main(String[] args) {
     A a = new A();
     a.print();
    }
}
