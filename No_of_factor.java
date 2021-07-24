public class No_of_factor {
    public static void main(String[] args) {
        System.out.print("No of factor ");
        int n = 14;
        int div = 1;
        int count = 0;
        while (div<=n) {
            if(n%div == 0){
        //        System.out.println(div);
                count = count+1;
            }
            div = div+1;
        }
        System.out.println(count);
    }
}
