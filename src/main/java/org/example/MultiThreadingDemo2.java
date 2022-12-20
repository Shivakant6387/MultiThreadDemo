package org.example;

public class MultiThreadingDemo2 extends Thread{
    public void run(){
        try{
            System.out.println("Thread "+Thread.currentThread().getId()+"is running ");
        }catch (Exception e){
            System.out.println("Exception is caught ");
        }
    }

    public static void main(String[] args) {
        int n=8;
        for(int i=0;i<n;i++){
            Thread obj=new Thread(new MultiThreadingDemo2());
            obj.start();}
    }
}
