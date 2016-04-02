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
        boolean uniqueCheck = false;
        ArrayList<String> usedPosibilities = new ArrayList<>();
        System.out.println("-------------------------");
        do {
            //System.out.println("001");
            count++;
            //System.out.println("002");
            sortedComputewall.clear();
            //System.out.println("003");
            boolean duplicateCheck = false;
            //System.out.println("004");
            boolean ohCheck = false;
            //System.out.println("005");
            //Set values and search for duplicates and 0
            do {
                //System.out.println("006");
                computewallValueReplace(computewallInt, 4, 0, rnd.nextInt(16));
                //System.out.println("007");
                computewallValueReplace(computewallInt, 4, 1, rnd.nextInt(16));
                //System.out.println("008");
                computewallValueReplace(computewallInt, 4, 2, rnd.nextInt(16));
                //System.out.println("009");
                computewallValueReplace(computewallInt, 4, 3, rnd.nextInt(16));
                //System.out.println("010");
                computewallValueReplace(computewallInt, 4, 4, rnd.nextInt(16));
                //System.out.println("011");
                ///*
                if (computewallInt[4][0] == computewallInt[4][1] | computewallInt[4][0] == computewallInt[4][2] | computewallInt[4][0] == computewallInt[4][3] | computewallInt[4][0] == computewallInt[4][4]
                        | computewallInt[4][1] == computewallInt[4][2] | computewallInt[4][1] == computewallInt[4][3] | computewallInt[4][1] == computewallInt[4][4]
                        | computewallInt[4][2] == computewallInt[4][3] | computewallInt[4][2] == computewallInt[4][4] | computewallInt[4][3] == computewallInt[4][4]) {
                    duplicateCheck = true;
                }
                //System.out.println("012");
                if (computewallInt[4][0] == 0 | (computewallInt[4][1] == 0) | (computewallInt[4][1] == 0) | (computewallInt[4][3] == 0) | computewallInt[4][4] == 0) {
                    ohCheck = true;
                }
                //System.out.println("013");
                //*/
            } while (duplicateCheck | ohCheck);
            usedPosibilities.add(String.valueOf(computewallInt [4][0]) + String.valueOf(computewallInt [4][1]) + String.valueOf(computewallInt [4][2])
                    + String.valueOf(computewallInt [4][3]) + String.valueOf(computewallInt [4][4]));
            //System.out.println("014");
            System.out.println("Lowest row calculated");
            /*
            System.out.println("Res. of conditions from random number generator:");
            System.out.println("(computewallInt [4][0] == computewallInt [4][1]): " + (computewallInt [4][0] == computewallInt [4][1])); //1
            System.out.println("(computewallInt [4][0] == computewallInt [4][2]): " + (computewallInt [4][0] == computewallInt [4][2])); //2
            System.out.println("(computewallInt [4][0] == computewallInt [4][3]): " + (computewallInt [4][0] == computewallInt [4][3])); //3
            System.out.println("(computewallInt [4][0] == computewallInt [4][4]): " + (computewallInt [4][0] == computewallInt [4][4])); //4
            System.out.println("(computewallInt [4][1] == computewallInt [4][2]): " + (computewallInt [4][1] == computewallInt [4][2])); //5
            System.out.println("(computewallInt [4][1] == computewallInt [4][2]): " + (computewallInt [4][1] == computewallInt [4][3])); //6
            System.out.println("(computewallInt [4][1] == computewallInt [4][4]): " + (computewallInt [4][1] == computewallInt [4][4])); //7
            System.out.println("(computewallInt [4][2] == computewallInt [4][3]): " + (computewallInt [4][2] == computewallInt [4][3])); //8
            System.out.println("(computewallInt [4][2] == computewallInt [4][4]): " + (computewallInt [4][2] == computewallInt [4][4])); //9
            System.out.println("(computewallInt [4][3] == computewallInt [4][4]): " + (computewallInt [4][3] == computewallInt [4][4])); //10
            System.out.println("Res. of duplicate check: " + duplicateCheck);
            System.out.println("(computewallInt [4][0] == 0): " + (computewallInt [4][0] == 0));
            System.out.println("(computewallInt [4][1] == 0): " + (computewallInt [4][1] == 0));
            System.out.println("(computewallInt [4][2] == 0): " + (computewallInt [4][2] == 0));
            System.out.println("(computewallInt [4][3] == 0): " + (computewallInt [4][3] == 0));
            System.out.println("(computewallInt [4][4] == 0): " + (computewallInt [4][4] == 0));
            if ((computewallInt [4][0] == 0) | (computewallInt [4][1] == 0) | (computewallInt [4][1] == 0) | (computewallInt [4][3] == 0) | (computewallInt [4][4] == 0)) {
                ohCheck = true;
            }
            System.out.println("Res. of 0 check: " + ohCheck);
            System.out.println("Complete res: " + (duplicateCheck | ohCheck));
            */

            //Rest of calculating
            computewallInt[3][0] = Math.abs(computewallInt[4][0] - computewallInt[4][1]);
            //System.out.println("015");
            computewallInt[3][1] = Math.abs(computewallInt[4][1] - computewallInt[4][2]);
            //System.out.println("016");
            computewallInt[3][2] = Math.abs(computewallInt[4][2] - computewallInt[4][3]);
            //System.out.println("017");
            computewallInt[3][3] = Math.abs(computewallInt[4][3] - computewallInt[4][4]);
            //System.out.println("018");
            computewallInt[2][0] = Math.abs(computewallInt[3][0] - computewallInt[3][1]);
            //System.out.println("019");
            computewallInt[2][1] = Math.abs(computewallInt[3][1] - computewallInt[3][2]);
            //System.out.println("020");
            computewallInt[2][2] = Math.abs(computewallInt[3][2] - computewallInt[3][3]);
            //System.out.println("021");
            computewallInt[1][0] = Math.abs(computewallInt[2][0] - computewallInt[2][1]);
            //System.out.println("022");
            computewallInt[1][1] = Math.abs(computewallInt[2][1] - computewallInt[2][2]);
            //System.out.println("023");
            computewallInt[0][0] = Math.abs(computewallInt[1][0] - computewallInt[1][1]);
            //System.out.println("024");
            System.out.println("Rest of table calculated");
            sortedComputewall.add(computewallInt[0][0]);
            //System.out.println("025");
            sortedComputewall.add(computewallInt[1][0]);
            //System.out.println("026");
            sortedComputewall.add(computewallInt[1][1]);
            //System.out.println("027");
            sortedComputewall.add(computewallInt[2][0]);
            //System.out.println("028");
            sortedComputewall.add(computewallInt[2][1]);
            //System.out.println("029");
            sortedComputewall.add(computewallInt[2][2]);
            //System.out.println("030");
            sortedComputewall.add(computewallInt[3][0]);
            //System.out.println("031");
            sortedComputewall.add(computewallInt[3][1]);
            //System.out.println("032");
            sortedComputewall.add(computewallInt[3][2]);
            //System.out.println("033");
            sortedComputewall.add(computewallInt[3][3]);
            //System.out.println("034");
            sortedComputewall.add(computewallInt[3][3]);
            //System.out.println("035");
            sortedComputewall.add(computewallInt[4][4]);
            //System.out.println("036");
            sortedComputewall.add(computewallInt[4][1]);
            //System.out.println("037");
            sortedComputewall.add(computewallInt[4][2]);
            //System.out.println("038");
            sortedComputewall.add(computewallInt[4][3]);
            //System.out.println("039");
            Object[] sortedComputeWallInt = sortedComputewall.toArray();
            //System.out.println("040");
            Arrays.sort(sortedComputeWallInt);
            System.out.println("041");
            if (sortedComputewall.contains(0) | !sortedComputewall.contains(1) | !sortedComputewall.contains(2) | !sortedComputewall.contains(3) | !sortedComputewall.contains(4) |
                    !sortedComputewall.contains(5) | !sortedComputewall.contains(6) | !sortedComputewall.contains(7) | !sortedComputewall.contains(8) | !sortedComputewall.contains(9) |
                    !sortedComputewall.contains(10) | !sortedComputewall.contains(11) | !sortedComputewall.contains(12) | !sortedComputewall.contains(13) | !sortedComputewall.contains(14) |
                    !sortedComputewall.contains(15)) {
                uniqueCheck = true;
            }
            System.out.println("042");
            /*
            System.out.println("sortedComputewall.contains(0): " + sortedComputewall.contains(0));
            System.out.println("sortedComputewall.contains(1): " + !sortedComputewall.contains(1));
            System.out.println("sortedComputewall.contains(2): " + !sortedComputewall.contains(2));
            System.out.println("sortedComputewall.contains(3): " + !sortedComputewall.contains(3));
            System.out.println("sortedComputewall.contains(4): " + !sortedComputewall.contains(4));
            System.out.println("sortedComputewall.contains(5): " + !sortedComputewall.contains(5));
            System.out.println("sortedComputewall.contains(6): " + !sortedComputewall.contains(6));
            System.out.println("sortedComputewall.contains(7): " + !sortedComputewall.contains(7));
            System.out.println("sortedComputewall.contains(8): " + !sortedComputewall.contains(8));
            System.out.println("sortedComputewall.contains(9): " + !sortedComputewall.contains(9));
            System.out.println("sortedComputewall.contains(10): " + !sortedComputewall.contains(10));
            System.out.println("sortedComputewall.contains(11): " + !sortedComputewall.contains(11));
            System.out.println("sortedComputewall.contains(12): " + !sortedComputewall.contains(12));
            System.out.println("sortedComputewall.contains(13): " + !sortedComputewall.contains(13));
            System.out.println("sortedComputewall.contains(14): " + !sortedComputewall.contains(14));
            System.out.println("sortedComputewall.contains(15): " + !sortedComputewall.contains(15));
            System.out.println("UniqueCheck: " + uniqueCheck);
            */
            System.out.println("-------------------------");
        } while (uniqueCheck);
        System.out.println("043");
    }

    public void computewallValueReplace(int[][] array, int row, int position, int value) {
        array[row][position] = value;
    }

}
