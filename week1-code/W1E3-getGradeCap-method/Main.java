public class Main {
    //ADD YOUR getGradeCap METHOD HERE
    public static double getGradeCap(String grade) {
        double cap = 0.0;
        switch (grade) {
            case "A+":
            case "A":
                cap = 5.0;
                break;
            case "A-":
                cap = 4.5;
                break;
            case "B+":
                cap = 4.0;
                break;
            case "B":
                cap = 3.5;
                break;
            case "B-":
                cap = 3.0;
                break;
            case "C":
                cap = 2.5;
                break;
            default:
        }
        return cap;
    }

    public static void main(String[] args) {
        System.out.println("A+: " + getGradeCap("A+"));
        System.out.println("B : " + getGradeCap("B"));
    }
}
