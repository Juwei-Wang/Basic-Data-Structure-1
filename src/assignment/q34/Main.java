package assignment.q34;

import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverse("word"));
    }

    public static String reverse(String word) {
        // 假设我已经反转了 n-1 字符
        // 我能否反转 n 个字符

        // "word" -> "row" + "d"

        if (word.length() == 1) {
            return word;
        }

        char last = word.charAt(word.length() - 1);
        String rest = word.substring(0, word.length() - 1);
        // abcdef
        // abcde

        return last + reverse(rest);
    }

    // O(n)
    public static String reverse2(String word) {
        LinkedList<Character> charList = new LinkedList<>();
        char[] chars = word.toCharArray();
        for (char aChar : chars) {
            charList.addLast(aChar);
        }

        LinkedList<Character> reversedCharList = reverseRecur(charList);

        StringBuilder builder = new StringBuilder();
        for (Character character : reversedCharList) {
            builder.append(character);
        }

        return builder.toString();
    }

    // T(n) = O(1) + T(n - 1) = O(n)
    public static LinkedList<Character> reverseRecur(LinkedList<Character> word) {

        if (word.size() == 1) {
            LinkedList<Character> characters = new LinkedList<>();
            characters.add(word.get(0));
            return characters;
        }


        // word: abcdef
        char last = word.getLast();
        // last: f
        word.removeLast();
        // word: abcde

        LinkedList<Character> reversed = reverseRecur(word);
        // reversed: edcba

        reversed.addFirst(last);
        // reversed: f edcba

        return reversed;
    }
}
