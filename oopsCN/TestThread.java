class ThreadOne extends Thread {

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread 1: " + i);
        }
    }
}

class ThreadTwo extends Thread {

    public void run() {
        for (int i = 10; i >= 1; i--) {

            if (i == 6) {
                try {
                    Thread.sleep(1000);  // sleep for 1000 ms
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }

            System.out.println("Thread 2: " + i);
        }
    }
}

class TestThread {
    public static void main(String[] args) {

        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();

        t1.start();
        t2.start();
    }
}
