import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Greater Element To the Right");
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<Integer>();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        for(int i = n-1; i >= 0; i--) {
            int e=arr[i];
            if(st.isEmpty()){
                arr[i]=-1;
            }else{
                while(st.size() >0 && e >= st.peek()){
                    st.pop();
                }
                if(st.isEmpty()){
                    arr[i]=-1;
                }else{
                    arr[i]=st.peek();
                }
            }
            st.push(e);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}