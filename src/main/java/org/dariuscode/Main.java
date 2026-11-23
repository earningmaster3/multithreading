package org.dariuscode;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

//yeild thread deligates her/his cpu time to other thread

        Thread t1 = new Thread(()->{
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("understood interption");

            }
        });
        t1.start();
        t1.interrupt();

        Thread t2 = new Thread(()->{
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            }catch (Exception e){

            }
        });
        t2.setName("worker-1");
        t2.start();
        System.out.println(t2.isAlive());

        try {
            Thread.sleep(3000);
        }catch (Exception e){

        }
        System.out.println(t2.isAlive());


    }
}