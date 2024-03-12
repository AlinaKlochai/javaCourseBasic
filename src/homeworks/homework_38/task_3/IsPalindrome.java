package homeworks.homework_38.task_3;

/*
Напишите функциональный интерфейс для проверки, является ли строка палиндромом.
 */

public class IsPalindrome {
    public static void main(String[] args) {

        PalindromeChecker palindromeChecker = (stringForChecking -> {
          int left = 0;
          int right = stringForChecking.length() - 1;

          while (left < right){
              if (stringForChecking.charAt(left) != stringForChecking.charAt(right)){
                  return false;
              }
              left++;
              right--;
          }
          return true;
        });

        String string1 = "hello";
        String string2 = "world";
        String string3 = "radar";

        boolean result1 = palindromeChecker.isPalindrome(string1);
        boolean result2 = palindromeChecker.isPalindrome(string2);
        boolean result3 = palindromeChecker.isPalindrome(string3);

        System.out.println(string1 + " is a palindrome: " + result1);
        System.out.println(string2 + " is a palindrome: " + result2);
        System.out.println(string3 + " is a palindrome: " + result3);
    }
}
