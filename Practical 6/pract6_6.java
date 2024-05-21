import java.util.*;
class IllegalMarkException extends Exception {
 	IllegalMarkException(String message) {
        super(message);
    }
}

class MarkList {
     int regNo;
     int marks;

    public MarkList(int regNo, int marks) {
        this.regNo = regNo;
        this.marks = marks;
    }

    public void checkMark() throws IllegalMarkException {
        if (marks < 0) {
            throw new IllegalMarkException("Illegal Mark");
        }
    }

    public String getResult() {
        if (marks >= 40) {
            return "PASS";
        } else {
            return "FAIL";
        }
    }
}

public class pract6_6 {
    public static void main(String[] args) {
        MarkList[] markLists = {
            new MarkList(101, 75),
            new MarkList(102, 35),
            new MarkList(103, -10)
        };

        for (MarkList markList : markLists) {
            try {
                markList.checkMark();
                System.out.println("Registration Number: " + markList.regNo + ", Result: " + markList.getResult());
            } catch (IllegalMarkException e) {
                System.out.println("Registration Number: " + markList.regNo + ", Error: " + e);
            }
        }
    }
}
