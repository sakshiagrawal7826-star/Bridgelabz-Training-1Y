package com.gla.Level3;
import java.util.Random;
public class FootballTeamHeights {
    public static int[] generateHeights(int size) {
        Random random = new Random();
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = 150 + random.nextInt(101); // 150 to 250
        }
        return heights;
    }
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }
    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int height : heights) {
            if (height < min) {
                min = height;
            }
        }
        return min;
    }
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            if (height > max) {
                max = height;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] heights = generateHeights(11);
        System.out.println("Heights of Players:");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println("\n\nShortest Height: " + findShortest(heights) + " cm");
        System.out.println("Tallest Height: " + findTallest(heights) + " cm");
        System.out.println("Mean Height: " + findMean(heights) + " cm");
    }
}