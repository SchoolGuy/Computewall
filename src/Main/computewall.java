package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class computewall {

    int[][] computewallInt = null;
    int count;
    ArrayList<Integer> sortedComputewall = null;
    Random rnd = new Random();

    public computewall() {
        count = 0;
        sortedComputewall = new ArrayList<>();
        computewallInt = new int[5][5];
        computewallInt[0][0] = 0;
        computewallInt[1][0] = 0;
        computewallInt[1][1] = 0;
        computewallInt[2][0] = 0;
        computewallInt[2][1] = 0;
        computewallInt[2][2] = 0;
        computewallInt[3][0] = 0;
        computewallInt[3][1] = 0;
        computewallInt[3][2] = 0;
        computewallInt[3][3] = 0;
        computewallInt[4][0] = 0;
        computewallInt[4][1] = 0;
        computewallInt[4][2] = 0;
        computewallInt[4][3] = 0;
        computewallInt[4][4] = 0;
        calculate();
        System.out.println("Rounds till solved: " + count);
        System.out.println("        " + computewallInt[0][0]);
        System.out.println("      " + computewallInt[1][0] + " | " + computewallInt[1][1]);
        System.out.println("    " + computewallInt[2][0] + " | " + computewallInt[2][1] + " | " + computewallInt[2][2]);
        System.out.println("  " + computewallInt[3][0] + " | " + computewallInt[3][1] + " | " + computewallInt[3][2] + " | " + computewallInt[3][3] + " | ");
        System.out.println(computewallInt[4][0] + " | " + computewallInt[4][1] + " | " + computewallInt[4][2] + " | " + computewallInt[4][3] + " | " + computewallInt[4][4]);
    }

    public void calculate() {
        boolean uniqueCheck;
        do {
            count++;
            if (count % 1000 == 0) {
                System.out.println("count: " + count);
            }
            sortedComputewall.clear();
            uniqueCheck = false;
            //Set values
            for (int i = 0; i < 4; i++) {
                for (int j = 0; i < 16; j++) {
                    computewallValueReplace(computewallInt, 4, i, j);
                }
            }

            //Rest of calculating
            computewallInt[3][0] = Math.abs(computewallInt[4][0] - computewallInt[4][1]);
            computewallInt[3][1] = Math.abs(computewallInt[4][1] - computewallInt[4][2]);
            computewallInt[3][2] = Math.abs(computewallInt[4][2] - computewallInt[4][3]);
            computewallInt[3][3] = Math.abs(computewallInt[4][3] - computewallInt[4][4]);
            computewallInt[2][0] = Math.abs(computewallInt[3][0] - computewallInt[3][1]);
            computewallInt[2][1] = Math.abs(computewallInt[3][1] - computewallInt[3][2]);
            computewallInt[2][2] = Math.abs(computewallInt[3][2] - computewallInt[3][3]);
            computewallInt[1][0] = Math.abs(computewallInt[2][0] - computewallInt[2][1]);
            computewallInt[1][1] = Math.abs(computewallInt[2][1] - computewallInt[2][2]);
            computewallInt[0][0] = Math.abs(computewallInt[1][0] - computewallInt[1][1]);
            sortedComputewall.add(computewallInt[0][0]);
            sortedComputewall.add(computewallInt[1][0]);
            sortedComputewall.add(computewallInt[1][1]);
            sortedComputewall.add(computewallInt[2][0]);
            sortedComputewall.add(computewallInt[2][1]);
            sortedComputewall.add(computewallInt[2][2]);
            sortedComputewall.add(computewallInt[3][0]);
            sortedComputewall.add(computewallInt[3][1]);
            sortedComputewall.add(computewallInt[3][2]);
            sortedComputewall.add(computewallInt[3][3]);
            sortedComputewall.add(computewallInt[3][3]);
            sortedComputewall.add(computewallInt[4][4]);
            sortedComputewall.add(computewallInt[4][1]);
            sortedComputewall.add(computewallInt[4][2]);
            sortedComputewall.add(computewallInt[4][3]);
            Object[] sortedComputeWallInt = sortedComputewall.toArray();
            Arrays.sort(sortedComputeWallInt);
            if (sortedComputewall.contains(0) | !sortedComputewall.contains(1) | !sortedComputewall.contains(2) | !sortedComputewall.contains(3) | !sortedComputewall.contains(4) |
                    !sortedComputewall.contains(5) | !sortedComputewall.contains(6) | !sortedComputewall.contains(7) | !sortedComputewall.contains(8) | !sortedComputewall.contains(9) |
                    !sortedComputewall.contains(10) | !sortedComputewall.contains(11) | !sortedComputewall.contains(12) | !sortedComputewall.contains(13) | !sortedComputewall.contains(14) |
                    !sortedComputewall.contains(15)) {
                uniqueCheck = true;
            }
        } while (uniqueCheck);
    }

    public void computewallValueReplace(int[][] array, int row, int position, int value) {
        array[row][position] = value;
    }

}
