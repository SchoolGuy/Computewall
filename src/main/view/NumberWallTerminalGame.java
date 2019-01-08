package main.view;

import main.controller.NumberwallCalculator;
import main.models.NumberwallModel;

public class NumberWallTerminalGame {

    private NumberwallModel solution;
    private NumberwallModel userInput;
    private int numberOfRound;

    public NumberWallTerminalGame() {
        // Default Constructor
        userInput = new NumberwallModel();
    }

    public void startGame(){
        //TODO: User Input and related stuff.
        NumberwallCalculator calculator = new NumberwallCalculator();
        solution = calculator.calculate(userInput);
        numberOfRound = calculator.getCount();
    }

    public void printSolution() {
        System.out.println("Rounds till solved: " + numberOfRound);
        System.out.println("        " + solution.computewallInt[0][0]);
        System.out.println("      " + solution.computewallInt[1][0] + " | " + solution.computewallInt[1][1]);
        System.out.println("    " + solution.computewallInt[2][0] + " | " + solution.computewallInt[2][1] + " | "
                + solution.computewallInt[2][2]);
        System.out.println("  " + solution.computewallInt[3][0] + " | " + solution.computewallInt[3][1] + " | "
                + solution.computewallInt[3][2] + " | " + solution.computewallInt[3][3] + " | ");
        System.out.println(solution.computewallInt[4][0] + " | " + solution.computewallInt[4][1] + " | "
                + solution.computewallInt[4][2] + " | " + solution.computewallInt[4][3] + " | "
                + solution.computewallInt[4][4]);
    }
}
