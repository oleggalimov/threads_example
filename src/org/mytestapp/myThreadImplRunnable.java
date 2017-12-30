package org.mytestapp;

public class myThreadImplRunnable implements Runnable {
    //прием для создания класса потока внутри отдельного класса
    Thread runnableThread;

    public myThreadImplRunnable() {
        this.runnableThread=new Thread(this);

    }

    public void run() {
        System.out.println("Starting thread "+Thread.currentThread().getName());


    }
    public void incrementN (int n) {
        for (int i = 0; i < 100; i++) {
            n++;
        }
        System.out.println("From "+Thread.currentThread().getName()+" n="+n);
    }
}
