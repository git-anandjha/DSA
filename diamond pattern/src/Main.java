import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("diamond");
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int str=(n/2)+1;
        int mid=str;
        int spaces=1;
        for (int i = 1; i <= n;i++) {
            System.out.println(str+","+spaces);
            if(i<=n/2){
                str--;
                spaces+=2;
            }else{
                str++;
                spaces-=2;
            }

        }
    }
}