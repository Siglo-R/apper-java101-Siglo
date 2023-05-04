
public class oddEven {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 234, 2, 4, 56, 17, 50, 1235, 6, 1, 23, 48, 47, 34};
        isOddEven(nums);
    }

    public static void isOddEven(int[] nums) {
        int isEven = 0;
        int isOdd = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                System.out.println(nums[i] + " is even");
                isEven++;
            } else {
                System.out.println(nums[i] + " is odd");
                isOdd++;
            }
        }
        System.out.println("Number of even numbers: " + isEven);
        System.out.println("Number of odd numbers: " + isOdd);
    }
}