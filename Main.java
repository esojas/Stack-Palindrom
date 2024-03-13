import java.util.ArrayDeque;
import java.util.Deque;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String text = "racecar";
        System.out.println(fillStack(text));
        System.out.println(buildReverse(text));
        System.out.println(isPalindrome(text));
    }
    private static Deque<Character> fillStack (String inputString){
        Deque<Character> stack = new ArrayDeque<Character>();
        for (int i=0; i<inputString.length();i++){
            stack.push(inputString.charAt(i));
        }
        return stack;
    }

    private static String buildReverse (String inputString){
        Deque<Character> charStack = fillStack(inputString);
        StringBuilder reversedString = new StringBuilder();
        while(!charStack.isEmpty()){
            reversedString.append(charStack.pop());
        }
        return reversedString.toString();
    }
    public static boolean isPalindrome(String inputString) {
        if (inputString.equals(buildReverse(inputString))) {
            return true;
        } else {
            return false;
        }
    }
}
