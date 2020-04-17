import java.util.Scanner;
public class BasicCalculator {

    int answer;
    int integer1;
    int integer2;

    public BasicCalculator(int integer1, int integer2){
        this.integer1 = integer1;
        this.integer2 = integer2;
    }

    public void equalTo(){
        System.out.println(" = " + answer);
    }

    public void add(){
        answer = integer1 + integer2;
        System.out.print(integer1 + " + " + integer2);
    }

    public void subtract(){
        answer = integer1 - integer2;
        System.out.print(integer1 + " - " + integer2);
    }

    public void multiply(){
        answer = integer1 * integer2;
        System.out.print(integer1 + " * " + integer2);
    }

    public void divide(){
        answer = integer1 / integer2;
        System.out.print(integer1 + " / " + integer2);
    }

    public void modulo(){
        answer = integer1 % integer2;
        System.out.print(integer1 + " % " + integer2);
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int button;
        boolean calculatorOn;

        System.out.println("Enter 1 to turn on calculator");
        button = sc.nextInt();

        while(button == 1 && button != 0) {

            System.out.println("Enter you expression, eg: x + y ");
            int firstInt = sc.nextInt();
            char operator = sc.next().charAt(0);
            int secondInt = sc.nextInt();

            BasicCalculator calculation = new BasicCalculator(firstInt, secondInt);

            if (operator == '+') {
                calculation.add();
                calculation.equalTo();
            } else if (operator == '-') {
                calculation.subtract();
                calculation.equalTo();
            } else if (operator == '*') {
                calculation.multiply();
                calculation.equalTo();
            } else if (operator == '/') {
                calculation.divide();
                calculation.equalTo();
            } else if (operator == '%') {
                calculation.modulo();
                calculation.equalTo();
            }

            System.out.println("Enter 0 to turn off calculator, enter 1 to continue");
            button = sc.nextInt();
        }
        System.out.println("Happy calculating!");







    }
}
