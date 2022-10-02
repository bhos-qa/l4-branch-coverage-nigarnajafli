package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Classroom {
    int[] finalResults = new int[]{90, 95, 98, 100, 84, 80, 50, 60, 61, 84, 90, 96, 70, 20, 40, 75, 66};

    public int getMaximumResult() {
        int max = finalResults[0];
        for (int i = 0; i < finalResults.length; i++) {
            if(finalResults[i] > max)
                max = finalResults[i];
        }
        return max;
    }

    public int getMinimumResult() {
        int min = finalResults[0];
        for (int i = 0; i < finalResults.length; i++) {
            if(finalResults[i] <min)
                min = finalResults[i];
        }
        return min;
    }

    public int getNumberOfStudents() {
        return finalResults.length;
    }

    public void sortAscendingOrder() {
        int temp = 0;
        int n = finalResults.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(finalResults[i] > finalResults[j]) {
                    temp = finalResults[i];
                    finalResults[i] = finalResults[j];
                    finalResults[j] = temp;
                }
            }
        }
        for (int i = 0; i < finalResults.length; i++) {
            System.out.print(finalResults[i] + " ");
        }
    }

    public int getSecondLargestResult() {
        int temp;
        int n = finalResults.length;
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (finalResults[i] > finalResults[j])
                {
                    temp = finalResults[i];
                    finalResults[i] = finalResults[j];
                    finalResults[j] = temp;
                }
            }
        }
        return finalResults[n-2];
    }

    public int getThirdLargestResult() {
        int temp;
        int n = finalResults.length;
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (finalResults[i] > finalResults[j])
                {
                    temp = finalResults[i];
                    finalResults[i] = finalResults[j];
                    finalResults[j] = temp;
                }
            }
        }
        return finalResults[finalResults.length-3];
    }

    public int getMostFrequentResult() {
        int maxcount = 0;
        int n = finalResults.length;
        int element_having_max_freq = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (finalResults[i] == finalResults[j]) {
                    count++;
                }
            }

            if (count > maxcount) {
                maxcount = count;
                element_having_max_freq = finalResults[i];
            }
        }

        return element_having_max_freq;
    }

    public int getMaximumDifference() {
        int n = finalResults.length;
        int max_diff = finalResults[1] - finalResults[0];
        int i, j;
        for (i = 0; i < n; i++)
        {
            for (j = i + 1; j < n; j++)
            {
                if (finalResults[j] - finalResults[i] > max_diff)
                    max_diff = finalResults[j] - finalResults[i];
            }
        }
        return max_diff;
    }

    public double findMeanOfResults() {
        int sum = 0;
        int n = finalResults.length;
        for (int i = 0; i < n; i++)
            sum += finalResults[i];

        return (double)sum / (double)n;
    }

    public double findMedianOfResults() {
        int n = finalResults.length;
        Arrays.sort(finalResults);
        if (n % 2 != 0)
            return (double)finalResults[n / 2];

        return (double)(finalResults[(n - 1) / 2] + finalResults[n / 2]) / 2.0;
    }

    public void openNotepad() {
        try {
            System.out.println("Executing notepad.exe");
            Process process = Runtime.getRuntime().exec("notepad.exe");
            System.out.println("Notepad should now open.");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}