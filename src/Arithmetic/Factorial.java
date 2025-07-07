package Arithmetic;

public class Factorial {
    public static int factorial(int y){
        if (y==0||y==1){
            return 1;
        }else{
            return y*factorial(y-1);
        }
    }
    public static void main(String[] args){
        int result = factorial(5);
        System.out.print("Factorial: " +result);
    }
}
