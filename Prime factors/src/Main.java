import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        int div=2;
        while(n!=1 && div*div<=n){
            if(n%div==0){
                n=n/div;
                System.out.println(div);
            }else{
                div++;
            }
        }
        if(n!=1){
            System.out.println(n);
        }
    }
}