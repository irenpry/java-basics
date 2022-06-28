package org.itmo.java.lesson5;

public class Main {
    public static void main(String[] args) {
        String string = "Тестовая строка для поиска длиннейшего слова";
        System.out.println(getLongestWord(string));
        String palindrome = "Анна";
        String notPalindrome = "Аня";
        System.out.println(palindrome + (isPalindrome(palindrome) ? " - это палиндром" : " - это не палиндром"));
        System.out.println(notPalindrome + (isPalindrome(notPalindrome) ? " - это палиндром" : " - это не палиндром"));
        String badPhrase = "Здесь была бы бяка, но мы ее вырезали, т.к. бяка - это запрещенное слово";
        String badWord = "бяка";
        System.out.println(censor(badPhrase,badWord));
        System.out.println(getCountOccur(badPhrase,badWord));
        System.out.println(reversWords(badPhrase));

    }

    /* Первое задание */
    static String getLongestWord(String string) {
        String[] array = string.split(" ");
        String longestWord = null;
        int maxLength = 0;
        for (String s : array) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                longestWord = s;
            }
        }
        return longestWord;
    }

    /* Второе задание */
    public static boolean isPalindrome(String string) {
        return new StringBuilder(string).reverse().toString().equalsIgnoreCase(string);
    }

    /* Третье задание */
    public static String censor(String string, String badWord) {
        return string.replace(badWord, "[вырезано цензурой]");
    }

    /* Четвертое задание */
    public static int getCountOccur(String string, String substring) {
        int countOccur = 0;
        StringBuilder stringBuilder = new StringBuilder(string);
        while (stringBuilder.indexOf(substring) != -1) {
            countOccur++;
            stringBuilder.delete(stringBuilder.indexOf(substring),stringBuilder.indexOf(substring) + substring.length());
        }
        return countOccur;
    }

    /* Пятое задание */
    public static String reversWords(String string) {
        String[] array = string.split(" ");
        StringBuilder resultString = new StringBuilder();
        for (String s : array) {
            resultString.append(new StringBuilder(s).reverse())
                    .append(" ");
        }
        return resultString.toString();
    }
}
