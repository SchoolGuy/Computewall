package Main;

import java.util.ArrayList;
import java.util.Arrays;

public class computewall {

    int[][] computewallInt = null;
    int count;
    ArrayList<Integer> sortedComputewall = null;

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
        boolean unique = false;
        //Set values
        for (int i = 1; i < 16 & !unique; i++) {
            for (int j = 1; j < 16 & !unique; j++) {
                for (int k = 1; k < 16 & !unique; k++) {
                    for (int l = 1; l < 16 & !unique; l++)
                        for (int m = 1; m < 16 & !unique; m++) {
                            unique = false;
                            System.out.println(i + "|" + j + "|" + k + "|" + l + "|" + m);
                            if (!(i==j | i==k | i==l | i==m | j==k | j==m | j==l | k==l | k==m | l==m)) {
                                computewallInt [4][0] = i;
                                computewallInt [4][1] = j;
                                computewallInt [4][2] = k;
                                computewallInt [4][3] = l;
                                computewallInt [4][4] = m;

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
                                if (!sortedComputewall.contains(0) & sortedComputewall.contains(1) & sortedComputewall.contains(2) &
                                        sortedComputewall.contains(3) & sortedComputewall.contains(4) & sortedComputewall.contains(5) & sortedComputewall.contains(6) &
                                        sortedComputewall.contains(7) & sortedComputewall.contains(8) & sortedComputewall.contains(9) &
                                        sortedComputewall.contains(10) & sortedComputewall.contains(11) & sortedComputewall.contains(12) & sortedComputewall.contains(13) &
                                        sortedComputewall.contains(14) & sortedComputewall.contains(15)) {
                                    unique = true;
                                }
                            }
                        }
                }
            }
        }

        /*
        count++;
        if (count % 100000 == 0) {
            System.out.println("count: " + count);
        }
        sortedComputewall.clear();
        unique = false;

        computewallValueReplace(computewallInt, 4, i, j);

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
        if (!sortedComputewall.contains(0) | !sortedComputewall.contains(1) | !sortedComputewall.contains(2) | !sortedComputewall.contains(3) | !sortedComputewall.contains(4) |
                !sortedComputewall.contains(5) | !sortedComputewall.contains(6) | !sortedComputewall.contains(7) | !sortedComputewall.contains(8) | !sortedComputewall.contains(9) |
                !sortedComputewall.contains(10) | !sortedComputewall.contains(11) | !sortedComputewall.contains(12) | !sortedComputewall.contains(13) |
                !sortedComputewall.contains(14) | !sortedComputewall.contains(15)) {
            unique = true;
        }
        System.out.println(unique);
        */
    }

}
