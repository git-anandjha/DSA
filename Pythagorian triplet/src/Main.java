import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scn=new Scanner(System.in);
        int n1= scn.nextInt();
        int n2= scn.nextInt();
        int n3= scn.nextInt();
        int max=n1;
        if(n2>max){
            max=n1;
        }
        if(n3>max){
            max=n3;
        }
        boolean flag=false;
        if(max==n1){
            flag= max*max==(n2*n2)+(n3*n3);
        }else if(max==n2){
            flag= max*max==(n1*n1)+(n3*n3);
        }else{
            flag= max*max==(n1*n1)+(n2*n2);
        }
        System.out.println(flag);
    }
}