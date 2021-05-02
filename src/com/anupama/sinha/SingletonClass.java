package com.anupama.sinha;

//Only 1 Object can be instantiated
//Private Constructors + Public static getInstance method + public variables + No Setters
class Singleton{
    private static Singleton s1 = null;
    public String s;

    private Singleton(){
        s="Singleton Object";
    }

    public static Singleton getInstance(){
        if (s1 == null) {
            s1 = new Singleton();
        }
        return s1;
    }
}

public class SingletonClass {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        s1.s = s1.s.toUpperCase();
        System.out.println(s1.s);

        s2.s = s2.s.toLowerCase();
        System.out.println(s2.s);


    }
}
