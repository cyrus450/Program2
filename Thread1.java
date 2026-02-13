package threaddemo;

class Thread1 implements Runnable{

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
            	System.out.println("Thread1 : " + i);
                Thread.sleep(2000);
                Thread.yield();// BLOCKED state
                
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}