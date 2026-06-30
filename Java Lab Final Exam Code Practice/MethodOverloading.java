class Addition {

    void add() {
        System.out.println("No parameters");
    }

    void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    void add(double a, double b) {
        System.out.println("Sum = " + (a + b));
    }

}

public class MethodOverloading {

    public static void main(String[] args) {

        Addition obj = new Addition();

        obj.add();

        obj.add(10, 20);

        obj.add(5.5, 4.5);

    }

}