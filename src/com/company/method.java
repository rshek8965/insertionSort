package com.company;

public class method {

    public static void swap(int[]arr, int i, int j)
    {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void insertionSort(int[] list1)
    {
        //loop through the entire array, use an index i
        for (int i = 0; i < list1.length; i++)
        {
            //loop from index i back to the beginning of the array, use index j
            for (int j = i; j>0; j--)
            {
                if (list1[j-1]>list1[j])
                {
                    //if element at j-1 is greater than element at j, swap them
                    swap(list1, j-1, j);
                }
                else
                {
                    //else set j to 0
                    j=0;
                }
            }
        }
    }
}
