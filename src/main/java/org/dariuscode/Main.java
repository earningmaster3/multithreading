package org.dariuscode;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

     //yeild thread deligates her/his cpu time to other thread

        Thread t1 = new Thread(()->{
            while (true) {
                System.out.println("understood interption");

            }
        });
        t1.setDaemon(true);
        t1.start();
        try {
            Thread.sleep(2000);
        }catch (Exception e){

        }

        return;

    }
}