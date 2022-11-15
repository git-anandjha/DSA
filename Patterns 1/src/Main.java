import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("patterns");
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int spaces=n-1;
        for(int i=1;i<=n;i++){
            for(int v=1;v<=spaces;v++){
                System.out.print(" ");
            }
            spaces--;
            for(int c=i;c>0;c--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}