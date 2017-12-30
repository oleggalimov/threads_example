package org.mytestapp;

public class myThreadExtendsThread extends Thread {


    public void run(int n) {
        System.out.println("Starting thread "+Thread.currentThread().getName());
    }
    public void incrementN (int n) {
        for (int i = 0; i < 100; i++) {
            n++;
        }
        System.out.println("From "+Thread.currentThread().getName()+" n="+n);
    }


}
