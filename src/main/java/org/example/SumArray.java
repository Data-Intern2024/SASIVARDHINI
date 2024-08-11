package org.example;

public class SumArray {
    public static void main(String[] args) {
        int array[]={2,2,3,1,12,1};
        int sum=0;
        for(int i = 0; i < array.length; i++){
            sum=sum+array[i];
        }
        System.out.println(sum);;
    }
}
