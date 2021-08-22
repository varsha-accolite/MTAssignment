package threadmethods.com;

public class Test extends Thread{
	
	  public void run() {  
		  for(int i = 0; i <= 10; i=i+2) {  
			  try {  
			    Thread.sleep(100);  
			  }
			  catch(Exception e) {
				  System.out.println(e);
			  }  
			  System.out.print(i+" ");  
		  } 
	  }
	     
	  public static void main(String args[]) {  
	     Test t1 = new Test();
	     Test t2 = new Test();
	     Test t3 = new Test();
	     t2.setDaemon(true);
	     t1.start(); 
	     while(t1.isAlive()) {
		     try {
		    	 t1.sleep(100);
		     }
		     catch(InterruptedException e) {
		       System.out.println(e);
		     }
		     System.out.println("Sleep completed");
	     }
	     try {  
	    	 t1.join();  
	     }
	     catch(Exception e) {
	    	 System.out.println(e);
	     }  
	     t2.start();  
	     t3.start();
	     t2.setName("secthread");
	     t3.setPriority(2);
	     System.out.println("Thread 2 isDaemon : " + t2.isDaemon());
	     System.out.println("Thread 3 isDaemon : " + t3.isDaemon());
	     System.out.println("Thread 2 name : " + t2.getName());
	     System.out.println("Thread 3 priority : " + t3.getPriority());
	  }  
}
