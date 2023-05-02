import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int ent_num = scanner.nextInt();
        int ctr=0;
        boolean FALSE=false;
        boolean TRUE=true;
        if(ent_num <=1){

            System.out.println(FALSE);
        }
        else {
            for (int i = 2; i <= ent_num; i++) {
                if (ent_num % i == 0){
                    ctr++;
                }
            }
            if (ctr<=1){
                System.out.println(TRUE);
            }
            else {
                System.out.println(FALSE);
            }
        }
    }
}
