package main.controller;

import main.models.NumberwallModel;

import java.util.Arrays;
import java.util.Random;

/**
 * This class solves the mathematical problem.
 */
public class NumberwallCalculator {

    /**
     * This variable contains the number of rounds to calculate the final result.
     */
    private int count;
    /**
     * Just a random number generator...
     */
    private Random rnd;
    /**
     * Contains if the problem handed to the calculator is solved.
     */
    private boolean solved;

    /**
     * Default constuctor which initilizes all variables.
     */
    public NumberwallCalculator(){
        count = 0;
        rnd = new Random();
    }

    /**
     * @return If the problem is solved it returns the number of rounds, else -1.
     */
    public int getCount() {
        if (isSolved()) {
            return count;
        } else {
            return -1;
        }
    }

    /**
     * @return If the problem is solved this returns true.
     */
    public boolean isSolved() {
        return solved;
    }

    public NumberwallModel calculate(NumberwallModel input) {
        boolean uniqueCheck;
        do {
            count++;
            if (count % 1000 == 0) {
                System.out.println("count: " + count);
            }
            input.sortedComputewall.clear();
            boolean duplicateCheck;
            boolean ohCheck;
            uniqueCheck = false;
            //Set values and search for duplicates and 0
            do {
                duplicateCheck = false;
                ohCheck = false;
                computewallValueReplace(input.computewallInt, 4, 0, rnd.nextInt(16));
                computewallValueReplace(input.computewallInt, 4, 1, rnd.nextInt(16));
                computewallValueReplace(input.computewallInt, 4, 2, rnd.nextInt(16));
                computewallValueReplace(input.computewallInt, 4, 3, rnd.nextInt(16));
                computewallValueReplace(input.computewallInt, 4, 4, rnd.nextInt(16));
                if (input.computewallInt[4][0] == input.computewallInt[4][1]
                        | input.computewallInt[4][0] == input.computewallInt[4][2]
                        | input.computewallInt[4][0] == input.computewallInt[4][3]
                        | input.computewallInt[4][0] == input.computewallInt[4][4]
                        | input.computewallInt[4][1] == input.computewallInt[4][2]
                        | input.computewallInt[4][1] == input.computewallInt[4][3]
                        | input.computewallInt[4][1] == input.computewallInt[4][4]
                        | input.computewallInt[4][2] == input.computewallInt[4][3]
                        | input.computewallInt[4][2] == input.computewallInt[4][4]
                        | input.computewallInt[4][3] == input.computewallInt[4][4]) {
                    duplicateCheck = true;
                }
                if (input.computewallInt[4][0] == 0
                        | (input.computewallInt[4][1] == 0)
                        | (input.computewallInt[4][1] == 0)
                        | (input.computewallInt[4][3] == 0)
                        | input.computewallInt[4][4] == 0) {
                    ohCheck = true;
                }
            } while (duplicateCheck | ohCheck);

            //Rest of calculating
            input.computewallInt[3][0] = Math.abs(input.computewallInt[4][0] - input.computewallInt[4][1]);
            input.computewallInt[3][1] = Math.abs(input.computewallInt[4][1] - input.computewallInt[4][2]);
            input.computewallInt[3][2] = Math.abs(input.computewallInt[4][2] - input.computewallInt[4][3]);
            input.computewallInt[3][3] = Math.abs(input.computewallInt[4][3] - input.computewallInt[4][4]);
            input.computewallInt[2][0] = Math.abs(input.computewallInt[3][0] - input.computewallInt[3][1]);
            input.computewallInt[2][1] = Math.abs(input.computewallInt[3][1] - input.computewallInt[3][2]);
            input.computewallInt[2][2] = Math.abs(input.computewallInt[3][2] - input.computewallInt[3][3]);
            input.computewallInt[1][0] = Math.abs(input.computewallInt[2][0] - input.computewallInt[2][1]);
            input.computewallInt[1][1] = Math.abs(input.computewallInt[2][1] - input.computewallInt[2][2]);
            input.computewallInt[0][0] = Math.abs(input.computewallInt[1][0] - input.computewallInt[1][1]);
            input.sortedComputewall.add(input.computewallInt[0][0]);
            input.sortedComputewall.add(input.computewallInt[1][0]);
            input.sortedComputewall.add(input.computewallInt[1][1]);
            input.sortedComputewall.add(input.computewallInt[2][0]);
            input.sortedComputewall.add(input.computewallInt[2][1]);
            input.sortedComputewall.add(input.computewallInt[2][2]);
            input.sortedComputewall.add(input.computewallInt[3][0]);
            input.sortedComputewall.add(input.computewallInt[3][1]);
            input.sortedComputewall.add(input.computewallInt[3][2]);
            input.sortedComputewall.add(input.computewallInt[3][3]);
            input.sortedComputewall.add(input.computewallInt[3][3]);
            input.sortedComputewall.add(input.computewallInt[4][4]);
            input.sortedComputewall.add(input.computewallInt[4][1]);
            input.sortedComputewall.add(input.computewallInt[4][2]);
            input.sortedComputewall.add(input.computewallInt[4][3]);
            Object[] sortedComputeWallInt = input.sortedComputewall.toArray();
            Arrays.sort(sortedComputeWallInt);
            if (input.sortedComputewall.contains(0)
                    | !input.sortedComputewall.contains(1)
                    | !input.sortedComputewall.contains(2)
                    | !input.sortedComputewall.contains(3)
                    | !input.sortedComputewall.contains(4)
                    | !input.sortedComputewall.contains(5)
                    | !input.sortedComputewall.contains(6)
                    | !input.sortedComputewall.contains(7)
                    | !input.sortedComputewall.contains(8)
                    | !input.sortedComputewall.contains(9)
                    | !input.sortedComputewall.contains(10)
                    | !input.sortedComputewall.contains(11)
                    | !input.sortedComputewall.contains(12)
                    | !input.sortedComputewall.contains(13)
                    | !input.sortedComputewall.contains(14)
                    | !input.sortedComputewall.contains(15)) {
                uniqueCheck = true;
            }
        } while (uniqueCheck);

        return input;
    }

    private void computewallValueReplace(int[][] array, int row, int position, int value) {
        array[row][position] = value;
    }
}
