import java.util.Scanner;

public class M3Q7{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int arr[][] = new int[3][3];
        boolean f = false;

        for(int i = 0; i < 9; i++){
            arr[i/3][i%3] = scn.nextInt();
        }
        for(int i = 0; i < 3; i++){
            if (arr[i][0] == arr[i][1] && arr[i][0] == arr[i][2]){
                f = true;
            }
            if (arr[0][i] == arr[1][i] && arr[0][i] == arr[2][i]){
                f = true;
            }
        }
        if (arr[0][0] == arr[1][1] && arr[0][0] == arr[2][2]){
                f = true;
            }
            if (arr[0][2] == arr[1][1] && arr[0][2] == arr[2][0]){
                f = true;
            }
            if(f){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
    }
}