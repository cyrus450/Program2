package threaddemo;

public class ThreadLifeCycleDemo {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Thread1()); // NEW state
        Thread t2 = new Thread(new Thread2()); // NEW state
        System.out.println("Th1 state:" + t1.getState());
        
        t1.start();
        
        System.out.println("Th2 state:" + t2.getState());
        
    
        t2.start();
        try { 
        	t1.join();
        	t2.join();
        } catch (InterruptedException e) {
        	System.out.println("main thread interrupted");
        	
        }
       
        System.out.println("Thread1 state after excution:" + t1.getState());
        

        System.out.println("Thread2 state after excution:" + t2.getState());
        
    }
}