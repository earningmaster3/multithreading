package org.dariuscode;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Test test = new Test();
     Thread t1 = new Thread(()->test.show());
     Thread t2 = new Thread(()-> test.show());
     t1.start();
     t2.start();
    }
}

class Test{
    synchronized void show(){
        System.out.println("inside show");

        try {
            Thread.sleep(2000);

        }catch (Exception e){

        }
        System.out.println("show finished");
    }
}