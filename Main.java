import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long firstNum;
        long secondNum;
        String operation;
        boolean correctInput;

        while (true){
            correctInput = true;
            System.out.print("First Number Here: ");
            if(input.hasNextLong()){
                firstNum = input.nextLong();

                while(correctInput){
                    System.out.print("Second Number Here: ");
                    if(input.hasNextLong()){
                        secondNum = input.nextLong();

                        while(correctInput){
                            System.out.print("Input Operation(+, -, /, *): ");
                            operation = input.next();
                            if(operation.equals("+")){
                                addition(firstNum, secondNum);
                            }else if(operation.equals("-")){
                                subtraction(firstNum, secondNum);
                            }else if(operation.equals("*")){
                                multiplication(firstNum, secondNum);
                            }else if(operation.equals("/")){
                                division(firstNum, secondNum);
                            }else{
                                System.out.println("Invalid operation");
                                continue;
                            }

                            correctInput = false;
                        }
//                        correctInput = false;
                    }else{
                        System.out.println("Error");
                        input.next();
                    }
                }
            }else{
                System.out.println("Error");
                input.next();
            }


        }

    }

    public static void addition(long num1, long num2){
        System.out.println("Result: " + (num1 + num2));
    }

    public static void subtraction(long num1, long num2){
        System.out.println("Result: " + (num1 - num2));
    }

    public static void multiplication(long num1, long num2){
        System.out.println("Result: " + (num1 * num2));
    }

    public static void division(long num1, long num2){
        System.out.println("Result: " + (num1 / num2));
    }
}