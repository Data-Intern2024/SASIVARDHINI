package org.example;

public class CountOccurence {
    public static void main(String[] args) {
        int array[] = {2, 23, 32, 12, 2};
        int l = array.length;
        int count[] = new int[l];

        for (int i = 0; i < l; i++) {
            int number = array[i];
            for (int j = 0; j < l; j++) {
                if (number == array[j]) {
                    count[i]++;
                }
            }
        }

        for (int i = 0; i < l; i++) {
            System.out.println("Number: " + array[i] + " occurs " + count[i] + " times.");
        }
    }
}
