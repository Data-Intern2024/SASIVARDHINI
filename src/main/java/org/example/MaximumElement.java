package org.example;

public class MaximumElement {
    public static void main(String[] args) {

        int array[]={23,23,2,1,13121,131,313,1};
        int max=array[0];
        for (int i =0;i< array.length;i++){
            if (max<=array[i]){
                max=array[i];
            }
            else{
                i++;
            }
        }
        System.out.println(max);
    }
}
