/*
GFG problem link : https://www.geeksforgeeks.org/find-element-given-index-number-rotations/

Question : Find element at given index after a number of rotations

Input : arr[] : {1, 2, 3, 4, 5}
        ranges[] = { {0, 2}, {0, 3} }
        index : 1
Output : 3
Explanation : After first given rotation {0, 2}
                arr[] = {3, 1, 2, 4, 5}
              After second rotation {0, 3} 
                arr[] = {4, 3, 1, 2, 5}
After all rotations we have element 3 at given
index 1. 

*/

class ArrayRotation{
    public static void main(String []args){
        int arr[] = {1,2,3,4,5};
        int ranges[][] = { {0, 2}, {0, 3} };
        int index = 1;

        int i=0;
        while(i<ranges.length){
            rotate(arr, ranges[i][0], ranges[i][1]);
            i++;
        }
        System.out.println(arr[index]);
    }
    static int[] rotate(int[] arr, int start, int end){
        int temp = arr[end];
        int i=start;
        while(i<end){
            arr[i+1] = arr[i];
            i++;
        }
        arr[start] = temp;
        return arr;
    }
}