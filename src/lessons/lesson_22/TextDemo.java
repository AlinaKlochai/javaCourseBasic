package lessons.lesson_22;

import java.util.Arrays;

public class TextDemo {
    public static void main(String[] args) {

        Text text = new Text();
        TextServise servise = new TextServise();

        String[] textArray = servise.prepareTextArray(text.createText());

        System.out.println(Arrays.toString(textArray));

        String longestWord = servise.findLongestWord(textArray);
        System.out.println("Самое больщое слово: " + longestWord);

        String[] reversedText = servise.reverseSortTextArray(textArray);
        System.out.println(Arrays.toString(reversedText));





    }

}
