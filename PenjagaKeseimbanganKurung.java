import java.util.Scanner;
import java.util.Stack;

public class PenjagaKeseimbanganKurung {
    
    public static boolean cekSeimbang(String jimat) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : jimat.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char last = stack.pop();
                if ((ch == ')' && last != '(') || 
                    (ch == '}' && last != '{') || 
                    (ch == ']' && last != '[')) {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String jimat = sc.nextLine();
        
        if (cekSeimbang(jimat)) {
            System.out.println("Seimbang");
        } else {
            System.out.println("Tidak seimbang");
        }
        
        sc.close();
    }
}
