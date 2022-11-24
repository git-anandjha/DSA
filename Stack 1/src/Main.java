import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc=new Scanner(System.in);
        String str="";
        for (int i = 0; i < 633; i++) {
            str+=sc.nextLine();
        }
        int cls=0;
        int opn=0;
        for (int i = 0; i < str.length(); i++) {
            Character cr=str.charAt(i);
            if(cr=='('){
                opn++;
            }
            if(cr==')') {
                cls++;
            }
        }
        if(opn==cls){
            System.out.println(opn);
            System.out.println(cls);
            System.out.println(true);
        }else{
            System.out.println(opn);
            System.out.println(cls);
            System.out.println(false);
        }
        Stack<Character> st=new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==')'){
                if(st.peek()=='(') {
                    System.out.println(false);
                    return;
                }else{
                    while (st.peek()!='('){
                        st.pop();
                    }
                    st.pop();
                }
            }else{
                st.push(str.charAt(i));
            }
        }
        if(st.isEmpty()){
            System.out.println(true);
        }
    }
}