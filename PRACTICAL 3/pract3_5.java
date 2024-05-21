class Time {
    int hours;
    int minutes;

    // Method to initialize data of the class
    void initialize(int h, int m) {
        hours = h;
        minutes = m;
    }

    // Method to display the time
    void display() {
        System.out.println("Time: " + hours + " hours " + minutes + " minutes");
    }

    // Method to add two Time objects
    void sum(Time t1, Time t2) {
        int totalMinutes = (t1.hours * 60 + t1.minutes) + (t2.hours * 60 + t2.minutes);
        hours = totalMinutes / 60;
        minutes = totalMinutes % 60;
    }
}

public class pract3_5 {
    public static void main(String[] args) {
        // Creating objects of Time class
        Time T1 = new Time();
        Time T2 = new Time();
        Time T3 = new Time();

        // Initializing T1 and T2
        T1.initialize(2, 30);
        T2.initialize(1, 45);

        // Displaying T1 and T2
        System.out.println("Time T1:");
        T1.display();
        System.out.println("Time T2:");
        T2.display();

        // Adding T1 and T2
        T3.sum(T1, T2);

        // Displaying the sum
        System.out.println("Sum of T1 and T2:");
        T3.display();
    }
}
