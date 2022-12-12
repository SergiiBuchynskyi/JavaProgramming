package day10_NestedIf;

public class GrateReport {
    public static void main(String[] args) {
        String result = "";
        int score = 150;
        if (score >= 0 && score <=100){
            if (score >= 90){
                result = "Ex";
            }else if (score >= 80){
                result = "Gr";
            }else if (score >= 70){
                result = "Good";
            }else if (score >= 60){
                result = "Passed";
            }else if (score >= 50){
                result = "Failed";
            }
        }else {
            System.out.println("Invalid score");
        }

        System.out.println(result);



    }
}
