public class Main {

    public static void printTotalScore(String[] values){
        //TODO: Add your code here
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum = sum + Integer.parseInt(values[i]);
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        //WARNING: Do not change the code below
        printTotalScore(new String[]{});
        printTotalScore(new String[]{"0", "124", "-15"});
    }
}