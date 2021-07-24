public class Prime_M2 {
    public static void main(String[] args) {
        int n = 28;//1 & No itself will always be factor of a number.so,removed in this meethod
        int div = 2;
        int count = 0;
        // System.out.println("Factors are :");
        while (div <= n-1) {
            if (n % div == 0) {
                // System.out.println(div);
                count = count+1;
            }
            div = div+1;
        }
        // System.out.println(count);
        if (count == 0) {
            System.out.println(n+" is Prime Number");
        } else{
            System.out.println(n+ " is not Prime Number");
        }
    }
}
