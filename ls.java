import java.util.Scanner;

public class ls{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        int num[] = {5,6,8,3,2};
        int x;
        System.out.println("enter search element(5,6,8,3,2})");
        x = sc.nextInt();
        ls(num,x);
    }
public static void ls(int num[],int x ){
    for(int i=0;i<5;i++){
        if (num[i]== x){
            System.out.printf("element found at %dth position\n",i);
            return;
        }
    }
    System.out.println("not found");
}
} 
