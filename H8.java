import java.util.*;

public class H8 {
    public static void main(String[] args) {
        String str = "i,love,learning,java,java,very,much";
        printText(str);
    }

    public static void printText(String str) {
        Set<String> list = new LinkedHashSet<>(Arrays.asList(str.replace(".", "").split(",")));
        for (String word : list) {
            System.out.println(word.substring(0, 1).toUpperCase() + word.substring(1));
        }
    }
}



