package com.heaptree;

public class HeapDemo {
    public static void main(String[] args) {
        int inputData[] = { 23, 43, 12, 50, 5, 17, 8, 60, 11, 3 };
        HeapSorter heapArr = new HeapSorter(inputData);
        heapArr.sort();
        int sortedArray[] = heapArr.getArray();
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
    }
}