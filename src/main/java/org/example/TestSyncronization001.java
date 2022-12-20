package org.example;
class Table{
    void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
class MyThread1 extends Thread{
    Table table;
    MyThread1(Table table){
        this.table=table;
    }
    public void run(){
        table.printTable(5);
    }
}
class MyThread2 extends Thread{
    Table table;
    MyThread2(Table table){
        this.table=table;
    }
    public void run(){
        table.printTable(100);
    }
}
public class TestSyncronization001 {
    public static void main(String[] args) {

        Table obj=new Table();
        MyThread2 t2=new MyThread2(obj);
        MyThread1 t1=new MyThread1(obj);
        t1.start();
        t2.start();
    }


}
