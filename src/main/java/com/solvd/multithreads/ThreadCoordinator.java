package com.solvd.multithreads;

public class ThreadCoordinator extends Thread {

    public ThreadCoordinator() {
        start();
    }

    public void run() {
        for(int k=0; k<10; k++){
            Runnable printerA = new PrintRunnable("A   .", 100);
            Thread threadA = new Thread(printerA);
            threadA.start();
            Runnable printerB = new PrintRunnable(".   B", 99);
            Thread threadB = new Thread(printerB);
            threadB.start();
            try {
                threadA.join();
                threadB.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Runnable printerC = new PrintRunnable("  C  ", 100);
            Thread threadC = new Thread(printerC);
            threadC.start();
            try {
                threadC.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
