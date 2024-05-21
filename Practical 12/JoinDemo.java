public class JoinDemo implements Runnable {

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Thread is running: " + i);
            try {

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        JoinDemo joinDemo = new JoinDemo();
        Thread thread = new Thread(joinDemo);


        thread.start();

        try {

            thread.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }


        System.out.println("Main thread finished.");
    }
}
