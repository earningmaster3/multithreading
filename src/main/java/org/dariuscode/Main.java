package org.dariuscode;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

//yeild thread deligates her/his cpu time to other thread


        Thread t1 = new Thread(()->{
            for(int i=1; i<=10; i++){
                System.out.println("t1"+ i);
                Thread.yield();
            }
        });
        Thread t2 = new Thread(()->{
            for(int i=1; i<=10; i++){
                System.out.println("t1"+ i);
            }
        });
        t1.start();
        t2.start();


    }
}