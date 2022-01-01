public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        //Manual dependency injection
        ICalculator cal2 = new Calculator2();
        Calculate cal = new Calculate(cal2);
        cal.function();


    }
}
