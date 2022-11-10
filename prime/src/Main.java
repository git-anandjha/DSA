import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int low=scn.nextInt();
        int high=scn.nextInt();
        for (; low < high; low++) {
            int halfVal=low/2;
            int count=0;
            for(;halfVal>0;halfVal--){
                if(low%halfVal==0){
                    ++count;
                }
                if(count>2){
                    break;
                }
            }
            if(count<2){
                System.out.println(low);
            }
        }
    }
}