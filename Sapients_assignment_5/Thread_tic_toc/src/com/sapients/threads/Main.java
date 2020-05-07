package com.sapients.threads;
import java.lang.*;

public class Main{
    public static void main(String[] args) throws InterruptedException {
        Printer p1 = new Printer(1);
        Printer p2 = new Printer(2);
        Thread t1=new Thread(p1);
        Thread t2=new Thread(p2);
        t1.start();
        Thread.currentThread().sleep(10);
        t2.start();
    }
}