package com.anupama.sinha;

public class ThreadClass extends Thread{

    private  static ThreadClass t1;

    public void run(){
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread.currentThread().setName("Anupama"+this.getName());
        System.out.println(this.getName() + " " + Thread.currentThread().getId() + " " + this.getState());
    }

    public static void main(String[] args) throws InterruptedException {
        t1 = new ThreadClass();
        System.out.println(t1.getName() + " " +  t1.getId() + " " + t1.getState());

        System.out.println(t1.getName() + " " + t1.getPriority()); // Default priority : 5

        //Starts a new thread as start() invoked instead of run() directly
        t1.start();
        // Cant start twice as invokes IllegalThreadStateException
        //t1.start();

        ThreadClass t2 = new ThreadClass();

        t2.setPriority(10); //Max priority
        System.out.println(t2.getName() + " " + t2.getPriority());
        // Starts t2 only when t1 ends
        //t1.join();
        t2.start();
    }
}