public class Prime_M1 {
    public static void main(String[] args) {
        int n = 17;
        int div = 1;
        int count = 0;
        while(div<=n){
            if (n%div == 0) {
                // System.out.println(div);
                count = count+1;
            }
            div = div+1;
        }
       // System.out.println(count);
       if (count == 2) {
                   System.out.println(n+ " is prime");
    
       }else{
           System.out.println(n+ " is not prime");
       }
    }
}
