import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        int r= scn.nextInt();

        int temp=n;
        int nod=0;
        while(temp>=10){
            temp=temp/10;
            nod++;
        }
        r=nod%r;
        if(r<0){
            r=nod+r;
        }

    }
}