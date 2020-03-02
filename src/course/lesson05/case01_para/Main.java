package course.lesson05.case01_para;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println(isValid("[[]]"));
    }

    public static boolean isValid(String expression) {
        init();

        if (expression.length() == 0) {
            return true;
        }

        LinkedList<Character> opens = new LinkedList<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (isOpen(c)) {
                opens.addLast(c);
            } else {
                if (opens.size() == 0) {
                    return false;
                }

                char last = opens.getLast();
                if (isPair(last, c)) {
                    opens.removeLast();
                } else {
                    return false;
                }
            }
        }
        if (opens.size() > 0) {
            return false;
        }

        return true; // "[[[["
    }

    private static LinkedList<Character> openTags = new LinkedList<>();
    private static LinkedList<Character> closeTags = new LinkedList<>();

    private static void init() {
        openTags.add('(');
        openTags.add('[');
        openTags.add('{');
        closeTags.add(')');
        closeTags.add(']');
        closeTags.add('}');
    }

    public static boolean isOpen(char c) {
        return openTags.contains(c);
    }

    public static boolean isPair(char open, char close) {
        return openTags.indexOf(open) == closeTags.indexOf(close);
    }


}
