import java.util.*; 

public class ispallindrome {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your sentence: ");
        String input = sc.nextLine();
        boolean ispalindrom = ispallindrome(input);
        if (ispalindrom){
            System.out.println("It is palindrome");
        }
        else{
            System.out.println("It is not palindrome");
        }
    }

    private static Deque<Character> fillStack(String inputString){
        Deque<Character> deque = new LinkedList<>();

        for (char i : inputString.toCharArray() ){
            deque.push(i);
        }
        return deque;
    }

    private static String buildReverse(String inputString){
        Deque<Character> stack = fillStack(inputString);

        StringBuilder reversed = new StringBuilder();
        while(!stack.isEmpty()){
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }

    public static boolean ispallindrome(String inpuString){
        String proInput = inpuString.toLowerCase();
        String reverse = buildReverse(proInput);
        return proInput.equals(reverse);
    }
}
