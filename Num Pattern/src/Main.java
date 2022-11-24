import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("mountain");
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int spc=2*n-3;
        for (int i = 1; i <=n ; i++) {
            String val="";
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= spc; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1 ; j--) {
                if(j!=n){
                    System.out.print(j);
                }
            }
            spc-=2;
            System.out.println();
        }
    }
}