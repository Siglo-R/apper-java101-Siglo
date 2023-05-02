import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int entNum = scanner.nextInt();
        int ctr=0;
        boolean FALSE=false;
        boolean TRUE=true;
        if(entNum <=1){

            System.out.printf("%B", FALSE);
        }
        else {
            for (int i = 2; i <= entNum; i++) {
                if (entNum % i == 0){
                    ctr++;
                }
            }
            if (ctr<=1){
                System.out.printf("%B", TRUE);
            }
            else {
                System.out.printf("%B", FALSE);
            }
        }
    }
}
