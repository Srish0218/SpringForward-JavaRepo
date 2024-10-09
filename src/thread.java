class thread1 implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("thread1 is running at : " + i);
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class thread2 implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("                              thread2 is running at : " + i);
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}


public class thread {
    public static void main(String[] args) {
        thread1 th1 = new thread1();
        thread2 th2 = new thread2();

        Thread t1 = new Thread(th1);
        Thread t2 = new Thread(th2);

        t1.start();
        t2.start();

    }
}
