import java.util.Scanner;

public class M3Q6{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] data = new int[n];
        int[] dataSum = new int[n];
        for(int i = 0; i < n; i++){
            data[i] = scn.nextInt();
            int sum = 0;
            int tmp = data[i];
            while(tmp > 0){
                sum += tmp%10;
                tmp /= 10;
            }
            dataSum[i] = sum;
        }
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if((dataSum[i] == dataSum[j]) && (data[i] > data[j])){
                    int tmp = data[i];
                    data[i] = data[j];
                    data [j] = tmp;
                }
                else if(dataSum[i] > dataSum[j]){
                    int tmp = dataSum[i];
                    dataSum[i] = dataSum[j];
                    dataSum [j] = tmp;
                    tmp = data[i];
                    data[i] = data[j];
                    data [j] = tmp;
                }
            }
        }
        for(int i:data){
            if(i == data[data.length - 1]){
                System.out.print(i);
            }
            else{
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}