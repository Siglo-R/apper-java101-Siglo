// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    
    static int age; //Global variable; can be accessed later on inside the code; int 0 value = "0"
    static double salary; // double is 0.0
    static boolean isHappy; //boolean 0 value is false
    static char FavoriteLetter; //null
    static float weight;// 0
    static long distance;
    static int wrapperAge;
    // only in java, objects kailangan magka"null" value
    
    public static void main(String[] args) {
        System.out.println(age);
        System.out.println(salary);
        System.out.println(isHappy);
        System.out.println(FavoriteLetter);
        System.out.println(weight);
        System.out.println(distance);
        int a=0, b= 10, c=78;

        System.out.println((a+b) *c);
        
        //wrappers

        System.out.println(age + " " + wrapperAge);
    }
          //pass by value -> pwedeng icall yung variable sa succeeding methods
         //pass by reference-> mga list array objects 
         static void displayAgeINAFancyWay(Integer age) {

            System.out.println("fancy!" + age);
            age= age+ 100;
        }
        public static void displayFirstElementInArray() {
            
        }
}