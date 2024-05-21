class CartesianPoint {
    private int x;
    private int y;
    
    // Constructor with two parameters
    public CartesianPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    // Overloaded constructor with one parameter
    public CartesianPoint(int xy) {
        this(xy, xy);
    }
    
    // Getter methods
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    // Method to move the point with two parameters
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }
    
    // Overloaded method to move the point with a single parameter
    public void move(int d) {
        x = d;
        y = d;
    }
    
    // Method to display the current coordinates
    public void display() {
        System.out.println("Current coordinates: (" + x + ", " + y + ")");
    }
}

public class TestCartesianPoint {
    public static void main(String[] args) {
        // Testing CartesianPoint class
        CartesianPoint point = new CartesianPoint(3, 5);
        point.display();  // Output: Current coordinates: (3, 5)
        
        point.move(2, 4);
        point.display();  // Output: Current coordinates: (5, 9)
        
        point.move(10);
        point.display();  // Output: Current coordinates: (10, 10)
    }
}
