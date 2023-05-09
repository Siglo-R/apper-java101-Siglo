public class Scratch {
    //Fields: Store object
    //Methods: manipulate the state and perform operations
    //Constructors: Executable during object creation to initiate state
}

//example

/* class Flight {
int passenger;
int seats;

Flight(){
passenger = 0;
seats=150;
}

void addPassenger() {...} //method

Flight (data type) manilaToBoracay;
manilaToBoracay = new Flight();
 */

/* Encapsulation and Access modifiers

Encapsulation: implementation details of a class are generally hidden
Access Modifiers:
private: Only within the declaring class
public: Everywhere
No Access Modifier:Only within pacakage

================================================

package accessmodifiers.financial;

    public class Balance {
            private int amount;

            int getBalance(){
                return amount;
            }

  // even if set to private yung amount, you can get the amount if you use the setAmount function on the account
            public void setAmount(int amount) {
                if (amount< 900){
                    this.amount=900;
                } else{
                    this.amount= amount;
                }

            }

}

=====================================================
package accessmodifiers.financial;
public class Record {
    // even if set to private yung amount, you can get the amount if you use the setAmount function on the account since
    //minsan sensitive yung info of amount
    //cant set yung balance.amount here cause balance is private
    void displayBalance(){
       Balance balance = new Balance();
        balance.amount= 900;

        System.out.println(balance.amount);

        System.out.println(balance.getBalance());
    }

    public static void main(String[] args) {
        Record record = new Record();
        record.displayBalance();
    }


========================================================
package accessmodifiers.financial;

    public class Balance {
            private int amount;

            int getBalance(){
                return amount;
            }

  // even if set to private yung amount, you can get the amount if you use the setAmount function on the account
            public void setAmount(int amount) {
                if (amount< 900){
                    this.amount=900;
                } else{
                    this.amount= amount;
                }

            }

}

 */

