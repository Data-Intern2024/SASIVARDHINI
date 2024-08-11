package org.example;

public class ReverseArray {
    public static void main(String[] args) {
        int array[]={12,13,1,1,1,21,1};
        for(int i=0;i< array.length;i++){
            array[i]=array[array.length-1];
        }
        for (int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }
}
