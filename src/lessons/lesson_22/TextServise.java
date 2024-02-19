package lessons.lesson_22;

public class TextServise {


    public String[] prepareTextArray(String textSource){
        textSource = textSource.trim();
        textSource = textSource.replaceAll("—","");
        textSource = textSource.replaceAll("\\.","");
        textSource = textSource.replaceAll(",","");
        textSource = textSource.replaceAll("\\(","");
        textSource = textSource.replaceAll("\\)","");

        textSource = textSource.replaceAll("  "," ");
        textSource = textSource.toLowerCase();
        return textSource.split(" ");
    }

        // Подсчет количества вхождений заданного слова в текст
      /*  public int countWordOccurrences (String[]textSourse, String wordTarget){
            int count = 0;
                for (int i = 0; i < textSourse.length(); i++) {
                    if (textSourse[i].equals(wordTarget)) {
                        count++;
                    }
                }

            return count;
        }

       */


        public  String findLongestWord(String[] text){
        String londestWord = "";
            for (int i = 0; i < text.length; i++) {
                if(text[i].length() > londestWord.length()){
                    londestWord = text[i];
                }

            }
                return londestWord;

        }

        public String[] reverseSortTextArray(String[] text){
            String[] reversed = text.clone();

            for (int i = 0; i < reversed.length - 1; i++) {
                for (int j = 0; j < reversed.length - 1 - i; j++) {
                    if (reversed[j].compareTo(reversed[j + 1]) < 0) {
                        String tempWord = reversed[j];
                        reversed[j] = reversed[j + 1];
                        reversed[j + 1] = tempWord;
                    }
                }
            }
            return reversed;
        }

}
