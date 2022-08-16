public class GradeHelper {

    public static void main(String[] args) {
        //ADD CODE HERE
        String grade = args[0];
        double cutoff = 0;
        switch (grade) {
            case "A+":
            case "A":
                cutoff = 5.0;
                break;
            case "A-":
                cutoff = 4.5;
                break;
            case "B+":
                cutoff = 4.0;
                break;
            case "B":
                cutoff = 3.5;
                break;
            case "B-":
                cutoff = 3.0;
                break;
            case "C":
                cutoff = 2.5;
                break;
            default:
                break;
        }
        System.out.println("CAP for grade " + grade + " is " + cutoff);
    }
}
