package Yandex20250422;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findArrays(new int[]{3,7,5,4,4,3})));
        System.out.println(Arrays.toString(findArrays(new int[]{3,7,5,4,4,5,6,7})));
        System.out.println(Arrays.toString(findArrays(new int[]{2,2})));
        System.out.println(Arrays.toString(findArrays(new int[]{5,4,3,3,2})));
        System.out.println(Arrays.toString(findArrays(new int[]{})));
        System.out.println(Arrays.toString(findArrays(new int[]{1})));
    }
    public static int[] findArrays(int[] arr){
        if(arr.length == 0) return new int[]{};

        int start = 0;
        int maxLength=0, tmpLength = 0;
        int[] result = new int[]{0,0};
        boolean direction = arr[0]>arr[1];

        for(int i=0; i< arr.length-1; i++){
            if((arr[i]>arr[i+1] && direction) || (arr[i]<arr[i+1] && !direction)){
                tmpLength++;
            } else {
                if(maxLength < tmpLength){
                    maxLength = tmpLength;
                    result[0] = start;
                    result[1] = i;
                }
                tmpLength = 1;
                start = i;
                if(arr[i]>arr[i+1]) direction =true;
                if(arr[i]<arr[i+1]) direction =false;
            }
        }
        if(maxLength < tmpLength){
            result[0] = start;
            result[1] = arr.length-1;
        }
        return result;
    }
}
