interface Exam {
    boolean Pass(int mark);
}

interface Classify {
    String Division(int average);
}

class Result implements Exam, Classify {
    public boolean Pass(int mark) {
        return mark >= 50;
    }

    public String Division(int average) {
        if (average >= 60)
            return "First";
        else if (average >= 50)
            return "Second";
        else
            return "No division";
    }
}

public class pract5_3 {
    public static void main(String[] args) {
        Result result = new Result();

        System.out.println("Pass with mark 60: " + result.Pass(60));
        System.out.println("Pass with mark 40: " + result.Pass(40));

        System.out.println("Division with average 70: " + result.Division(70));
        System.out.println("Division with average 55: " + result.Division(55));
        System.out.println("Division with average 45: " + result.Division(45));
    }
}

