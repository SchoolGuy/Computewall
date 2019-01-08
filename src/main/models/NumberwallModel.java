package main.models;

import java.util.ArrayList;

/**
 * This class contains the data for a Numberwall.
 */
public class NumberwallModel {
    /**
     * Contains the numbers for a Numberwall.
     */
    public int[][] computewallInt;
    /**
     *
     */
    public ArrayList<Integer> sortedComputewall;

    public NumberwallModel() {
        sortedComputewall = new ArrayList<>();
        computewallInt = new int[5][5];
        // Top
        computewallInt[0][0] = 0;

        // First row
        computewallInt[1][0] = 0;
        computewallInt[1][1] = 0;

        // Second row
        computewallInt[2][0] = 0;
        computewallInt[2][1] = 0;
        computewallInt[2][2] = 0;

        // Third row
        computewallInt[3][0] = 0;
        computewallInt[3][1] = 0;
        computewallInt[3][2] = 0;
        computewallInt[3][3] = 0;

        // Fourth row
        computewallInt[4][0] = 0;
        computewallInt[4][1] = 0;
        computewallInt[4][2] = 0;
        computewallInt[4][3] = 0;
        computewallInt[4][4] = 0;
    }
}
