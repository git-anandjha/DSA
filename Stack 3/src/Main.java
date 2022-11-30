import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("GETR");
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<Integer>();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        for (int i = n-1; i >=0; i--) {
            int num=arr[i];
            while (st.peek()<num){
                if(st.isEmpty()){
                    st.push(num);
                    arr[i]=-1;
                } else if (st.peek()<num) {
                    st.pop();
                }else{
                    st.push(num);
                }
            }

            st.push(num);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}