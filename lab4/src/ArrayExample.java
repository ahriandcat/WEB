import java.util.Scanner;

public class ArrayExample {

    public static int[] createArray(){
        int[] intArray = new int[5]; //khởi tạo
        intArray[0] = 9; //Gán giá trị cho phần tử
        intArray[1] = 5;
        intArray[2] = 7;
        intArray[3] = 2;
        intArray[4] = 6;

        return intArray;
    }

    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static int getMin(int[] arr){
        int min = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int[] sortArray(int[] intArray){
        for(int i = 0; i < intArray.length; i++){
            for(int j = i+1; j < intArray.length; j++ ){
                if(intArray[i] > intArray[j]){
                    int temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        return intArray;
        //printArray(intArray);
    }

    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử mảng : ");
        int n = sc.nextInt();

        int [] arr = new int[n];

        for (int i=0;i<n;i++){
            System.out.printf("Nhập phần tử arr[%d] ",i);
            arr[i] = sc.nextInt();
    }
        return arr;
    }
}