package threaddemo;

class Thread2 implements Runnable {
	
	public void run() {
		try {
			for (int i = 10; i <=15; i++) {
			
			    System.out.println("Thread2 : " + i);
				Thread.sleep(2000);
				Thread.yield();
			}
			
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
