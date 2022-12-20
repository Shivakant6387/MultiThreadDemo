package org.example;

public class TestInterruptingThread1 extends Thread{
    public void run(){
        try {


            Thread.sleep(1000);
            System.out.println(" Task");
        }catch (InterruptedException e){
          //  throw new RuntimeException("Thread interrupted "+e);
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        TestInterruptingThread1 thread1=new TestInterruptingThread1();
        thread1.start();
        try {
            thread1.interrupt();
        }catch (Exception e){
            System.out.println("Exception handled"+e);
        }
    }
}
