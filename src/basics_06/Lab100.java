package src.basics_06;

public class Lab100 {
    public static void main(String[] args) {

        //Interview Question

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};

        System.out.println(arr1 == arr2); //Not equal, as references are different.

        int[] arr3 = arr1;

        System.out.println(arr1 == arr3); //true

        System.out.println(arr1.equals(arr2));//false
        //because, if it is String, its true, as it compares values.
        //but in Arrays, it compares references, where it is different.

    }
}
