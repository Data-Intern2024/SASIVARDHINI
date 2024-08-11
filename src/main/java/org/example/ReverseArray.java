package org.example;

public class ReverseArray {
    public static void main(String[] args) {
        int array[]={12,13,1,1,1,21,1};
        int a= array.length;
        for(int i=0;i< a/2;i++){
            int temp=array[i];
            array[i]=array[a-1-i];
            array[a-1-i]=temp;
        }
        for (int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }
}
