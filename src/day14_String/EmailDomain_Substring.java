package day14_String;

public class EmailDomain_Substring {
    public static void main(String[] args) {
        String email = "Cydeo.School@gmail.com";

        int beginningIndex = email.indexOf("@")+1;
        int lastIndex = email.lastIndexOf(".");

        String domain = email.substring(beginningIndex, lastIndex);
        System.out.println("domain = " + domain);
        System.out.println(email.lastIndexOf("gmail.com"));


    }
}
