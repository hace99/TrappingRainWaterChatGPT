package org.example;
import java.util.Scanner;

public class TrappingRainWater {
    public int trap(int[] height) {
        if (height == null || height.length < 3) {
            return 0;
        }

        int totalWater = 0;
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                leftMax = Math.max(leftMax, height[left]);
                totalWater += Math.max(0, leftMax - height[left]);
                left++;
            } else {
                rightMax = Math.max(rightMax, height[right]);
                totalWater += Math.max(0, rightMax - height[right]);
                right--;
            }
        }

        return totalWater;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the elevation map (1 <= n <= 2 * 10^4): ");
        int n = scanner.nextInt();

        // Check if n is within the valid range
        if (n < 1 || n > 2 * Math.pow(10, 4)) {
            System.out.println("Invalid input. Please enter a valid value for n.");
            return;
        }

        int[] elevationMap = new int[n];

        System.out.println("Enter the non-negative integers representing the elevation map (0 <= height[i] <= 10^5):");
        for (int i = 0; i < n; i++) {
            int heightValue = scanner.nextInt();

            // Check if the height value is within the valid range
            if (heightValue < 0 || heightValue > Math.pow(10, 5)) {
                System.out.println("Invalid input. Please enter a valid value for height[" + i + "].");
                return;
            }

            elevationMap[i] = heightValue;
        }

        TrappingRainWater solution = new TrappingRainWater();
        int trappedWater = solution.trap(elevationMap);
        System.out.println("Trapped water: " + trappedWater);
    }
}
