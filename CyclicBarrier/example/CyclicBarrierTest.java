package com.CyclicBarrier.example;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {
    public static void main(String[] args) {
           
           CyclicBarrier cyclicBarrier=new CyclicBarrier(3 ,new CyclicBarrrierEvent());
           System.out.println("cyclicB has been created with parties=3,"
                        + " when all 3 parties will reach common barrier point "
                        + "CyclicBarrrierEvent will be triggered");
 
           MyRunnable myRunnable1=new MyRunnable(cyclicBarrier);
           
           //Create and start 3 threads
           new Thread(myRunnable1,"Thread-1").start();
           new Thread(myRunnable1,"Thread-2").start();
           new Thread(myRunnable1,"Thread-3").start();
           
           try {
        	   Thread.sleep(5000);
        	   } catch (InterruptedException e) {
       	   e.printStackTrace();
       	   }
       	    
       	   //Create and start 3 more threads
       	   new Thread(myRunnable1,"Thread-4").start();
        	   new Thread(myRunnable1,"Thread-5").start();
       	   new Thread(myRunnable1,"Thread-6").start();
          
  }
 
}
 