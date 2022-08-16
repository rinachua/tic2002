import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static final double localCurrency = 1.70;

    //TODO: You can add more methods here
    public static String[] filterAmounts(String sentence) {
        String[] words = sentence.split(" ");
        String[] result = new String[words.length];
        int count = 0;
        for (String word : words) {
            if (word.startsWith("$")) {
                result[count] = word;
                count++;
            }
        }
        return Arrays.copyOf(result, count);
    }

    public static void main(String[] args) {
        String line;
        Scanner in = new Scanner(System.in);

        System.out.print("Your expenses while overseas?");
        //TODO: Add your code here
        line = in.nextLine();

        String[] amounts = filterAmounts(line);
        System.out.println("Expenses in overseas currency:" + Arrays.toString(amounts));
        double total = 0;
        for (String amount : amounts) {
            amount = amount.replace("$", "");
            total = total + (Double.parseDouble(amount) * localCurrency);
        }
        System.out.println("Total in local currency: $" + String.format("%.2f", total));
    }
}