package com.example.service;
/*多线程的创建方式1、「继承Thread类」，重写run()方法*/
/*public class Demo extends Thread{
    public void run(){}

    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        d1.start();
        d2.start();
    }
}*/
/*2.「实现Runnable接口」，重写run()*/
public class Demo implements Runnable{
    public void run(){}

    public static void main(String[] args) {
        Thread d1 = new Thread(new Demo());
        Thread d2 = new Thread(new Demo());
        d1.start();
        d2.start();
    }
}

