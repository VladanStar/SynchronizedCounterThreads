package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Brojac brojac = new Brojac();
        Thread t1 = new Thread(brojac,"Thread-01");
        Thread t2 = new Thread(brojac,"Thread-02");
        Thread t3 = new Thread(brojac,"Thread-03");
        t1.start();
        t2.start();
        t3.start();

    }
}
