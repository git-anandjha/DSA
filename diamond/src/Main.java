import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("diamond");
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int o=n/2;
        int in=-1;
        for (int i = 1; i <=n; i++) {
            System.out.println(o+", "+in);
            if(i<=n/2){
                o--;
                in+=2;
            }else{
                o++;
                in-=2;
            }
        }
    }
}