import java.util.ArrayList;

public class Main {
    //TODO: Add your code here
    private static ArrayList<Integer> numbers = new ArrayList<>();

    private static void addNumber(int i) {
        numbers.add(Integer.valueOf(i));
        System.out.println(numbers);
    }

    private static void removeNumber(int i) {
        numbers.remove(Integer.valueOf(i));
        System.out.println(numbers);
    }

    private static int getTotal() {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    private static boolean isFound(int i) {
        for (int number: numbers) {
            if (number == i) {
                return true;
            }
        }
        return false;
    }

    //WARNING: Do not change the code below
    public static void main(String[] args) {
        System.out.println("Adding numbers to the list");
        addNumber(3);
        addNumber(8);
        addNumber(24);
        System.out.println("The total is: " + getTotal());
        System.out.println("8 in the list : " + isFound(8) );
        System.out.println("5 in the list : " + isFound(5) );
        removeNumber(8);
        System.out.println("The total is: " + getTotal());
    }

}
