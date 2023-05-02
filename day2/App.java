
public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        // Variable Types
        //int, double, long,float,string, strings, short, etc.
        //camelcase-> camelCase when naming a variable snake case for naming a class snake_case
        //int 4 bytes long 8 bytes
        int quantity = 9; //invalid starting with numbers and some special characters but "_" okay
        long myBalanceInGcash = 1000000000;
        long newBalance = myBalanceInGcash + quantity; //NOTE: newBalance should be long to allocate additional numbers
        //adding 2 int values
        int Value = Integer.MAX_VALUE + Integer.MAX_VALUE;
        System.out.println(Value); //Results to overflow adjust "value" to long or adjust Integers to long values

        allAboutStrings();
        allAboutLoops();
    }
        public static void allAboutStrings(){
            String myName = "Orvyl";  //array of characters ['1', '', '', '',...]
            System.out.println(myName);
            System.out.println(myName.toLowerCase());
            System.out.println(myName.toUpperCase());
            String completeName = myName + " Tumaneng";
            System.out.println(completeName);
            System.out.println(myName.substring(2, 5));
            boolean isEqualName = myName.equals("orvyl");
            boolean isEqualIgnoreCase = myName.equalsIgnoreCase("orvyl");
            System.out.println(isEqualName + "  " + isEqualIgnoreCase);
        }


    public static void allAboutLoops(){
        // while loop
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.println(i);

        }
        // do while loop
        do {
            System.out.println("wooohoo");
        } while (false);
        // numerical output
        int j= 0;
        do {
            System.out.println(j);
            j++;
        } while (j<5);

        // for loop; More Accepted by the community in terms of running time than while
        for (int k = 1; k <= 10; k++) {
            System.out.println(k);
        }
    }

    //Prime Number Execution Code
    /*
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
*/
}
