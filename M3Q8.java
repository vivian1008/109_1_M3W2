import java.util.Scanner;

public class M3Q8{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int data[][] = new int[a][b];
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                data[i][j] = scn.nextInt();
            }
        }
        for(int j = 0; j < b; j++){
            for(int i = 0; i < a; i++){
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}