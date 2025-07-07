package Arithmetic;

public class Addition {
    public static int addition(int y){
        if (y==1) {
            return 1;
        }else{
            return y + addition(y - 1);
        }
    }
    public static void main(String[] args){
        int result = addition(5);
        System.out.println("addition:" +result);
    }
}
