package org.dariuscode;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        //multi thread codes goes here

        System.out.println("hello wolrd");
        Thread t1 = new Thread(()->{
            System.out.println("threa-1 started concurrently ");
        });

        t1.start(); //runnable

        //thread join
        t1.join();
        System.out.println("thread running ended");

    }
}