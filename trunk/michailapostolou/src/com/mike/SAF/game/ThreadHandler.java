package game;

public class ThreadHandler {
	
	 private final Object synchObj = new Object();
	  private int count;

	  public ThreadHandler(int noThreads) {
	    synchronized (synchObj) {
	      this.count = noThreads;
	    }
	  }
	  public void awaitZero() throws InterruptedException {
	    synchronized (synchObj) {
//	    	  System.out.println(count);
	    	while (count > 0) {
	            synchObj.wait();
	          }
	    }
	  }
	  public void countDown() {
	    synchronized (synchObj) {
	    	count--;
	      if (count < 0) {
	        synchObj.notifyAll();
//	        count=0;
	      }
	    }
	  }
	  
	  public void reset(int count) {
		  synchronized (synchObj) {
	      this.count = 2;
	    }
	}
	}
