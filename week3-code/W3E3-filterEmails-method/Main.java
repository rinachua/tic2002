import java.util.Arrays;

public class Main {
    public static String[] filterEmails(String[] items) {
        //TODO: Add your code here
        String[] emails = new String[items.length];
        int count = 0;
        for(String item : items){
            if (item.contains("@")){
                emails[count] = item;
                count++;
            }
        }
        return Arrays.copyOf(emails, count);
    }

    public static void printItems(String[] items) {
        //TODO: Add your code here
        System.out.println(Arrays.toString(items));
    }

    public static void main(String[] args) {
        //WARNING: Do not change the code below
        printItems(filterEmails(new String[]{}));
        printItems(filterEmails(new String[]{"abc"}));
        printItems(filterEmails(new String[]{"adam@example.com", "aab", "john@example.com", "some@"}));
        printItems(filterEmails(new String[]{"xyz", "@bee.com", "aab"}));
    }
}