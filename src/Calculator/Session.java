package Calculator;

import java.util.Scanner;

public class Session extends UserInput {
    public final char EXIT_BUTTON = 'y'; // User enters 'y' at the end of the loop to exit

    public final Scanner input = new Scanner(System.in);
    private char userButton;
    private boolean exit;

    public boolean getExit() {
        return exit;
    }

    public char getUserButton() {
        return userButton;
    }

    public void setExit(boolean exit) {
        this.exit = exit;
    }

    public void setUserButton(char userButton) {
        this.userButton = userButton;
    }

    public void askForExit() {
        System.out.println("Would you want to exit? y/n");
        this.setUserButton(input.nextLine().charAt(0));

        if (this.getUserButton() == EXIT_BUTTON)
            this.setExit(true);
    }

    public void sessionStart() {
        while (!this.getExit()) {
            // clears the console
            for (int clear = 0; clear < 1000; clear++)
                System.out.println("\b");

            this.countUserInput();

            this.askForExit();
        }
    }
}
