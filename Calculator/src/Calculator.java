import java.util.Scanner;

public class Calculator {
    public static void main(String []args){

        Scanner myScanner = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        int numOne = myScanner.nextInt();

        System.out.print("Please enter the second number: ");
        int numTwo  =myScanner.nextInt();


        System.out.println("        1.Adding two numbers");
        System.out.println("        2.Subtracting two numbers");
        System.out.println("        3.Multiplying two numbers");
        System.out.println("        4.Dividing two numbers");
        System.out.println("                                     ");
        System.out.print("Please select your option : ");
        int option = myScanner.nextInt();

        Calculator myCalculator = new Calculator();

        if (option == 1){
            int answer_1 = myCalculator.addition(numOne , numTwo);
            System.out.println("The summation of " + numOne + " and " + numTwo + " is " + answer_1);
        } else if (option == 2) {
            int answer_2 = myCalculator.substraction(numOne , numTwo);
            System.out.println("The subtraction of " + numOne + " and " + numTwo + " is " + answer_2);

        } else if (option == 3) {
            int answer_3 = myCalculator.multiplication(numOne , numTwo);
            System.out.println("The multiplication of " + numOne + " and " + numTwo + " is " + answer_3);
        } else if (option == 4) {
            double answer_4 = myCalculator.divison(numOne , numTwo);
            System.out.println("The division of " + numOne + " and " + numTwo + " is " + answer_4);
        }else {
            System.out.println("Invalid input Please try again later");
        }


    }

    public int addition(int numOne , int numTwo){
        int summation = numOne + numTwo;
        return summation;
    }

    public int substraction(int numOne , int numTwo){
        if (numOne > numTwo) {
            int diffrance = numOne - numTwo;
            return diffrance;
        }
        else {
            return 0;
        }
    }

    public int multiplication(int numOne , int numTwo){
        int multiply = numOne * numTwo;
        return multiply;
    }

    public double divison(int numOne , int numTwo){
        double divide = numOne / numTwo;
        return divide;
    }
}
