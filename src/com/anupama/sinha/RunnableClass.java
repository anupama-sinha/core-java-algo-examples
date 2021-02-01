package com.anupama.sinha;

public class RunnableClass implements Runnable{

    @Override
    public void run() {
        System.out.println(this.getClass().toString());
    }

    public static void main(String[] args) {
        RunnableClass r1 = new RunnableClass();
        Thread t2 = new Thread(r1);
        t2.start();
    }
}
