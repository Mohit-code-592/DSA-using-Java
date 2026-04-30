// solving multiple questions using array
import java.util.ArrayList;

public class Lec1 {
    public static void main(String[] args) {
        System.out.println("Hi i am learning java now");
        int arr[] = {1,2,3,4,5};

        int array[] = {1,3,4,-1,-4,-2,12};
        int newArray[] = {1,0,1,1,0,0,1,0};
        countNumOfZeroOne(newArray);

        int array1[] = {1,2,3,4,5,4};
        int res = firstUnSortedElement(array1);
        if(res == -1) {
            System.out.println("array in sorted");
        }
        else {
            System.out.println(res);
        }

        pairSwap(array);

        int arr01[] = {1,2,3,4,5};
        int arr02[] = {2,5,7,8,9};
        System.out.println("");
        intersectionOfArray(arr01, arr02);
        System.out.println("");

        int alternativeArray[] = {1,2,3,4,5,6};
        alternativeExtremeElement(alternativeArray);

    }

    static void alternativeExtremeElement(int array[]) {
        int left = 0;
        int right = array.length - 1;

        if(left == right) {
            System.out.print(array[left]);
        }

        while(left < right) {
            System.out.print(array[left] + " " + array[right] + " ");
            left++;
            right--;
        }
    }

    static void intersectionOfArray(int array1[], int array2[]) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int val1 : array1) {
            for(int val2 : array2) {
                if(val1 == val2) {
                    if(!(list.contains(val1))) {
                        list.add(val1);
                    }
                }
            }
        }

        for(int val : list) {
            System.out.print(val + " ");
        }
    }

    static void pairSwap(int array[]) {
        for(int i = 0; i < array.length - 1; i += 2) {
            int temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }

        for(int val : array) {
            System.out.print(val + " ");
        }

    }

    static int firstUnSortedElement(int array[]) {
        for(int i = 0; i < array.length - 1; i++) {
            if(array[i + 1] < array[i]) {
                return array[i + 1];
            }
        }
        return -1;
    }

    static void countNumOfZeroOne(int array[]) {
        int zeroCounter = 0;
        int oneCounter = 0;
        for(int val : array) {
            if(val == 0) {
                zeroCounter++;
            }
            else {
                oneCounter++;
            }
        }

        System.out.println("Num of Zeros in array : " + zeroCounter);
        System.out.println("num of one in array : " + oneCounter);
    }

    static int[] sumOfPostiveNegative(int array[]) {
        int sumOfPostives = 0;
        int sumOfNegatives = 0;

        for(int val : array) {
            if(val < 0) {
                sumOfNegatives += val;
            }
            else {
                sumOfPostives += val;
            }


        }

        int reslut[] = {sumOfPostives, sumOfNegatives};
        return reslut;
    }

    static void maximumElement(int arr[]) {
        int maxElement = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }

        System.out.println("maxElement is : " + maxElement);
    }

    static void linerSearch(int arr[], int key) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                System.out.println("Key find at index : " + i);
            }
        }
    }

    static void reverseArray(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static float averageFun(int arr[]) {
        int sum = 0;
        for(int val : arr) {
            sum += val;
        }

        int averageOfArray = sum / arr.length;
        return averageOfArray;
    }

    static void multiplyOfEach(int arr[]) {
        for(int val : arr) {
            val = val * 10;
            System.out.print(val + " ");
        }

    }
}

