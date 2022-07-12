package Calculator;

import java.util.Scanner;

public class UserInput extends Calculator {
    public final Scanner input = new Scanner(System.in);
    private String userInput;

    UserInput() {
        userInput = "none";
    }

    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    public void countUserInput() {
        System.out.println("enter the first number: ");
        this.setUserInput(input.nextLine());
        this.setFirstNum(Float.parseFloat(this.getUserInput()));

        System.out.println("enter the second number: ");
        this.setUserInput(input.nextLine());
        this.setSecondNum(Float.parseFloat(this.getUserInput()));

        System.out.println("enter the operator: ");
        this.setUserInput(input.nextLine());
        this.setOperator(this.getUserInput().charAt(0));

        this.countResult(this.getFirstNum(), (char) this.getOperator(), this.getSecondNum());
    }
}
