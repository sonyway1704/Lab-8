// Edit the file

public class lab8{
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        else{
            return n+sum(n-1);
        }
    }
    public static void main(String[] args){
        System.out.println(sum(5));
    }
}