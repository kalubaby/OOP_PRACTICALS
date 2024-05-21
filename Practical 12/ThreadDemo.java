public class public class ThreadDemo {

    public static void main(String[] args) {
        System.out.println("Without Synchronization:");
        Sum sum1 = new Sum();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new Incrementer(sum1));
            thread.start();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final sum (without synchronization): " + sum1.getSum());

        System.out.println("\nWith Synchronization:");
        Sum sum2 = new Sum();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new SynchronizedIncrementer(sum2));
            thread.start();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final sum (with synchronization): " + sum2.getSum());
    }
}
class Sum {
    private Integer sum = 0;

    public void increment() {
        sum++;
    }

    public Integer getSum() {
        return sum;
    }
}

class Incrementer implements Runnable {
    private Sum sum;

    public Incrementer(Sum sum) {
        this.sum = sum;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            sum.increment();
        }
    }
}

class SynchronizedIncrementer implements Runnable {
    private Sum sum;
    public SynchronizedIncrementer(Sum sum) {
        this.sum = sum;
    }
    public void run() {
        for (int i = 0; i < 1000; i++) {
            synchronized (sum) {
                sum.increment();
            }
        }
    }
}	
 {

    public static void main(String[] args) {
        System.out.println("Without Synchronization:");
        Sum sum1 = new Sum();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new Incrementer(sum1));
            thread.start();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final sum (without synchronization): " + sum1.getSum());

        System.out.println("\nWith Synchronization:");
        Sum sum2 = new Sum();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new SynchronizedIncrementer(sum2));
            thread.start();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final sum (with synchronization): " + sum2.getSum());
    }
}
class Sum {
    private Integer sum = 0;

    public void increment() {
        sum++;
    }

    public Integer getSum() {
        return sum;
    }
}

class Incrementer implements Runnable {
    private Sum sum;

    public Incrementer(Sum sum) {
        this.sum = sum;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            sum.increment();
        }
    }
}

class SynchronizedIncrementer implements Runnable {
    private Sum sum;
    public SynchronizedIncrementer(Sum sum) {
        this.sum = sum;
    }
    public void run() {
        for (int i = 0; i < 1000; i++) {
            synchronized (sum) {
                sum.increment();
            }
        }
    }
}	
