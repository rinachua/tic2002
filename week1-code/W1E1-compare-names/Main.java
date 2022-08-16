public class Main {
    public static void main(String[] args) {
        //ADD CODE HERE
        String firstName = args[0];
        String secondName = args[1];
        System.out.println("Words given: " + firstName + ", " + secondName);
        System.out.println("They are the same: " + firstName.equals(secondName));
    }
}
