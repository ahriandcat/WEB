public class MultiArray {
    public static void createArray(){
        int[][] arr = new int[3][3];
        arr[0][0]=9;
        arr[0][1]=7;
        arr[0][2]=8;
        arr[1][0]=4;
        arr[1][1]=3;
        arr[1][2]=5;
        arr[2][0]=1;
        arr[2][1]=6;
        arr[2][2]=2;

        for (int i=0;i< arr.length;i++){
            for (int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
