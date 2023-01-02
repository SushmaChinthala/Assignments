package com.company;

public class MinMaxFinder {
    public int[] findMinMax(int[] x) {
        int max = x[0];
        int min = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] > max)
                max = x[i];
            else if (x[i] < min)
                min = x[i];
        }
        int maxMin[] = {min, max};
        for(int i=0;i<2;i++)
            System.out.println(maxMin[i]);
        return maxMin;
    }
    public int maximum(int[] x) {
        int max = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] > max)
                max = x[i];
        }
        System.out.println(max);
        return max;

    }

    public int minimum(int[] x) {
        int min = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] < min)
                min = x[i];

        }
        System.out.println(min);
        return min;
    }
}


