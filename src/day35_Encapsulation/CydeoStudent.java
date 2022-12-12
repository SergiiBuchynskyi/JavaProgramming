package day35_Encapsulation;

public class CydeoStudent {

    public String name;
    public char gender;
    public int age, batchNumber, groupNumber;
    public String fieldOfStudy;

    public static String schoolName;
    public static String programminglang;
    private static String secretCode;

    static {
        schoolName = "Cydeo";
        programminglang = "Java";
        secretCode = "Wooden Spoon";
    }

/*    public static void setSecretCode(String secretCode) {
        CydeoStudent.secretCode = secretCode;
    }
*/

    public static String getSecretCode() {
        return secretCode;
    }
    public static void setSecretCode(String secretCode) {
        CydeoStudent.secretCode = secretCode;
    }

}
