package com.solvd.multithreads;

public class RabbitPrinter implements Runnable{
    @Override
    public void run() {
        System.out.println("New rabbit born!!!");
        new Thread(new RabbitPrinter()).start();
        new Thread(new RabbitPrinter()).start();
    }
}
