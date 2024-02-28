package lessons.lesson_32.task_3_Dequeue;

import java.util.Deque;
import java.util.LinkedList;

public class IsPolindrom {
    public static void main(String[] args) {
     String word = "noon";

        System.out.println(word + " является ли полиндромом? " + isPalindrom(word));

        String word2 = "banan";
        System.out.println(word2 + " является ли полиндромом? " + isPalindrom(word2));



    }
    public static boolean isPalindrom(String word){
        Deque<Character> characterDeque = new LinkedList<>();
        for (int i = 0; i < word.length(); i++) {
            characterDeque.addLast(word.charAt(i));
        }

        while (characterDeque.size() > 1){
            if (!characterDeque.removeFirst().equals(characterDeque.removeLast())){
                return false;
            }
        }
        return true;
    }
}
