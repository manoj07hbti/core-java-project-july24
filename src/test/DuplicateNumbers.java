package test;

public class DuplicateNumbers {
    public static void main(String[] args) {
        int [] arr ={1, 2, 3, 4, 2, 7, 8, 8, 3,1,1,1,1};
        System.out.println("Duplicate elements in given array: ");
        //Searches for duplicate element
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                int count=j+1;
                if(arr[i] == arr[j])
                    System.out.println(count);
            }
        }
    }
}
