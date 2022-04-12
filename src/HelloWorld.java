import java.util.*;
public class HelloWorld {
    static void doSomething(int a){
        System.out.println("do something has been called " +a+ " times");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a integer number");
        int a = sc.nextInt();
        for(int i=0;i<a;i++){
            doSomething(i);
        }
    }
}
