public class pattern_9 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int nst = 1;
        int nsp= n-1;
        while(row<=n){

            int csp=0;
            while(csp<nsp){
                System.out.print("  ");
                csp++;
            }

            int cst=0;
            while(cst<nst){
                    System.out.print(" *");

                cst++;
            }



            nst=nst+2;
            nsp--;
            System.out.println();
            row++;
        }
    }
}
