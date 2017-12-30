package org.mytestapp;

public class main {
    public volatile int i=0;
    public static void main(String[] args) {
        int n=0;
        ThreadLocal <Integer> threadLocal = new ThreadLocal<>();
//        //1 способ - создание объекта потока и вызов напрямую
        myThreadExtendsThread myThread = new myThreadExtendsThread();
        myThread.start();
        myThread.incrementN(n);

        //Воторой способ - создание с использованием имплементации
        myThreadImplRunnable anotherThread = new myThreadImplRunnable();
        anotherThread.runnableThread.setDaemon(true);
        anotherThread.runnableThread.start();
        anotherThread.incrementN(n);
        //третий анонимный класс, который сразу вызывается
        System.out.println("Завершился главный поток "+Thread.currentThread().getName());
//        new Thread () {
//            public void run () {
//                threadLocal.set(100);
//                System.out.println("Starting thread "+Thread.currentThread().getName());
//                System.out.println(Thread.currentThread().getName()+threadLocal.get());
//
//                for (int i = 0; i < 10; i++) {
//                    if (i%2==0) {
//                        System.out.println("Tik from yat "+Thread.currentThread().getName());
//                    } else {
//                        System.out.println("tak from yat "+Thread.currentThread().getName());
//                    }
//                    try {
//                        Thread.sleep(500);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        }.run();
//        new Thread () {
//            public void run () {
//                threadLocal.set(50);
//                System.out.println("Starting thread "+Thread.currentThread().getName());
//                System.out.println(Thread.currentThread().getName()+threadLocal.get());
//                for (int i = 0; i < 10; i++) {
//                    if (i%2==0) {
//                        System.out.println("Tik from yat "+Thread.currentThread().getName());
//                    } else {
//                        System.out.println("tak from yat "+Thread.currentThread().getName());
//                    }
//                    try {
//                        Thread.sleep(500);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        }.run();



    }
}
