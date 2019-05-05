package com.newcstomecountdownlatch;

public class MyRunnable  implements Runnable{
	
	   SaralCountDownLatchCustom countDownLatchCustom; //HAS A REFERENCE
	    
	    MyRunnable(SaralCountDownLatchCustom countDownLatchCustom){
	           this.countDownLatchCustom=countDownLatchCustom;
	    }
	    
	    public void run(){
	           
	           for(int i=2;i>=0;i--){
	                  
	                  countDownLatchCustom.countDown();            
	                  System.out.println(Thread.currentThread().getName()+
	                               " has reduced latch count to : "+ i);
	                  
	                  try {
	                        Thread.sleep(1000);
	                  } catch (InterruptedException e) {
	                        e.printStackTrace();
	                  }
	           }
	                  
	    }
	    	

}
