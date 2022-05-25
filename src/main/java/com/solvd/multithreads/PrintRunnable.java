package com.solvd.multithreads;

public class PrintRunnable implements Runnable{

    private final String sign;
    private final Integer delay;

    public PrintRunnable(String sign, Integer delay) {
        this.sign = sign;
        this.delay = delay;
    }

    @Override
    public void run() {
        for(int k=0; k<10; k++ )
        try {
            System.out.println(sign);
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
