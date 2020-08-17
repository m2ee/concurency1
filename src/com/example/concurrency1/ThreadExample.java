package com.example.concurrency1;

public class ThreadExample extends Thread {
    // run() method contains the code that is executed by the thread.
    @Override
    public void run() {
        System.out.println("Inside run: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException{
        System.out.println("Inside main : " + Thread.currentThread().getName());

        System.out.println("Creating thread...");
        Thread thread = new ThreadExample("novi");

        System.out.println("Starting thread novi");
        thread.start();
        sleep(100);
        System.out.println("Stoping thread main");
}
    
    ThreadExample (){}
    ThreadExample (String name){
    	
    	super(name);
    }
}