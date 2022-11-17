import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("cross");
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int spc=n/2;
        int k=1;
        int v=0;
        for (int i = 1; i <=n; i++) {
            for (int j = 0; j <=spc ; j++) {
                System.out.print(" ");
            }
            int num=v;
            for (int j = 0; j < k; j++) {
                if(j<=k/2){
                    num++;
                }else{
                    num--;
                }
                System.out.print(num);
            }
            if(i<=n/2){
                spc--;
                k+=2;
                v++;
            }else{
                k-=2;
                spc++;
                v--;
            }
            System.out.println();
        }
    }
}