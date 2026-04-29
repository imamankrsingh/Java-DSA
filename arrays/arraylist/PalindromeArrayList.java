import java.util.ArrayList;

public class PalindromeArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(121);
        list.add(123);
        list.add(131);
        list.add(45);
        list.add(44);

        for (int num : list) {
            if (isPalindrome(num)) {
                System.out.println(num);
            }
        }
    }

    static boolean isPalindrome(int num) {
        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        return original == reverse;
    }
}