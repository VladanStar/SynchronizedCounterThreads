package com.company;

public class Brojac implements Runnable {
    private int b;

    public void inkrementiraj() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        b++;
    }

    public void dekrementiraj() {
        b--;
    }

    public int getB() {
        return b;
    }

    @Override
    public void run() {
        synchronized (this) {
            // inkrementiranje
            this.inkrementiraj();
            System.out.println("Vrednost nakon inkrementa: " + Thread.currentThread().getName() + " " + this.getB());
            // dekrement
            this.dekrementiraj();
            System.out.println("Vrednost nakon dekrementa: " + Thread.currentThread().getName() + " " + this.getB());
        }

    }
}
