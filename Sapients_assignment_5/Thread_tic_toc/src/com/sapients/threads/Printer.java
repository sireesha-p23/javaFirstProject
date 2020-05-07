package com.sapients.threads;

import java.lang.*;

class Printer implements Runnable{
    private int task;
    Printer(int threadNumber) {
        this.task = threadNumber;
    }
    public void run()
    {
        if (this.task==1) {
            for (int i = 0; i < 10; i++) {
                System.out.print("Tic ");
                try {
                    Thread.currentThread().sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        if (this.task==2)
        {
            for (int i = 0; i < 10; i++) {
                System.out.println("Toc");
                try {
                    Thread.currentThread().sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
