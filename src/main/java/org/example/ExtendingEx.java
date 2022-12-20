package org.example;
class Count extends Thread{
    Count(){
        super(" my extending thread");
        System.out.println(" my thread created"  +this);
    }
    public void run(){
        try{
            for (int i=0;i<10;i++){
                System.out.println("Printing the count "+i);
                Thread.sleep(1000);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Count count=new Count();
        try{
            while (count.isAlive()){
                System.out.println("Main thread will be alive till the child thread is live ");
                Thread.sleep(1000);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
public class ExtendingEx {
}
