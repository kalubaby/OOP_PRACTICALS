class Point {
    int x;
    int y;

    // Default constructor to initialize both data member values to 5
    Point() {
        x = 5;
        y = 5;
    }

    // Parameterized constructor to initialize members according to the values supplied by the user
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Copy constructor
    Point(Point p) {
        x = p.x;
        y = p.y;
    }

    // Function to display the coordinates of the point
    void display() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }
}

public class pract3_6 {
    public static void main(String[] args) {
        // Testing the Point class

        // Creating a point using default constructor
        Point p1 = new Point();
        System.out.println("Point 1 (default constructor):");
        p1.display();

        // Creating a point using parameterized constructor
        Point p2 = new Point(3, 7);
        System.out.println("\nPoint 2 (parameterized constructor):");
        p2.display();

        // Creating a point using copy constructor
        Point p3 = new Point(p2);
        System.out.println("\nPoint 3 (copy constructor):");
        p3.display();
    }
}
