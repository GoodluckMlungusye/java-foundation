package com.thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //using a class that extends Thread class
        MyThread thread = new MyThread();

        //using a class that implements runnable interface and passing instance of class as an argument to Thread class
        MyRunnable runnable = new MyRunnable();
        Thread thread1 = new Thread(runnable);

        thread.start();
        thread.join();
       // thread.join(3000);  3000ms after thread finishes thread1 will start
        thread1.start();
    }
}
