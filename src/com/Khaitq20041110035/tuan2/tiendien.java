package com.Khaitq20041110035.tuan2;

import java.util.Arrays;

public class tiendien {

    public static void main(String[] args) {
        tiendien computation = new tiendien();
        computation.tiendien(new int[]{50, 100, 150, 200}, new double[]{1, 1.2, 1.5, 1.75, 1.80});
        System.out.println(computation.calculateCost(160));
    }

    private int[] amountSteps;
    private double[] unitPrices;

    public tiendien() {
        tiendien(new int[]{}, new double[]{1});
    }

    public void tiendien(int[] electricStep, double[] prices) {
        if (electricStep == null) {
            throw new IllegalArgumentException("electricStep could not be null");
        }
        if (prices == null || prices.length <= electricStep.length) {
            throw new IllegalArgumentException("price table not valid, must be not null and equal price limits count + 1");
        }
        amountSteps = new int[electricStep.length];
        for (int i = 0; i < electricStep.length; i++) {
            if (i == 0) {
                if (electricStep[0] < 0) {
                    throw new IllegalArgumentException("First step must be greater than zero");
                }
                amountSteps[0] = electricStep[0];
            } else {
                amountSteps[i] = electricStep[i] - amountSteps[i - 1];
                if (amountSteps[i] <= 0) {
                    throw new IllegalArgumentException("Electric step " + i + "must be greater than previous step, found: " + electricStep[i]);
                }
            }
        }
        this.unitPrices = Arrays.copyOf(prices, electricStep.length + 1);
    }

    public double calculateCost(final int totalUsed) {
        if (totalUsed < 0) {
            throw new IllegalArgumentException("electric number must be positive number");
        }
        if (amountSteps == null) {
            return totalUsed;
        }
        final int AMOUNT_STEP_COUNT = amountSteps.length;
        if (AMOUNT_STEP_COUNT == 0) {
            return (double) totalUsed * unitPrices[0];
        }
        double totalCost = 0;
        int remainNumber = totalUsed;
        for (int amountStepIndex = 0; amountStepIndex < AMOUNT_STEP_COUNT; amountStepIndex++) {
            int calcNumber = Math.min(remainNumber, amountSteps[amountStepIndex]);
            remainNumber -= amountSteps[amountStepIndex];
            totalCost += (double) calcNumber * unitPrices[amountStepIndex];
            if (remainNumber <= 0) {
                break;
            }
        }
        if (remainNumber > 0) {
            totalCost += (double) remainNumber * unitPrices[AMOUNT_STEP_COUNT];
        }
        return totalCost;
    }
}