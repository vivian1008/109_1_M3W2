import java.util.Scanner;

public class M3Q5{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int count[][] = new int[2][26];
        int num = 1;
        for(int i = 0; i < str.length(); i++){
            int n = str.charAt(i) - 'a';
            if(n >= 0 && n <=26){
                count[0][n]++;
            }
            n = str.charAt(i) - 'A';
            if(n >= 0 && n <=26){
                count[1][n]++;
            }
            if(str.charAt(i) == ' '){
                num++;
            }
        }
        System.out.println(num);
        for(int k = 0; k < 2; k++){
            for(int i = 0; i < 26; i++){
                if(count[k][i] != 0 && k==0){
                    System.out.println((char)(i+'a') + ":" + count[k][i]);
                }
                if(count[k][i] != 0 && k==1){
                    System.out.println((char)(i+'A') + ":" + count[k][i]);
                }
            }
        }
    }
}