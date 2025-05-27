class MyThread extends Thread {
    private String message;

    MyThread(String message) {
        this.message = message;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(message + " - Count: " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class ThreadCreationExample {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1 is running");
        MyThread thread2 = new MyThread("Thread 2 is running");

        thread1.start();
        thread2.start();
    }
}
