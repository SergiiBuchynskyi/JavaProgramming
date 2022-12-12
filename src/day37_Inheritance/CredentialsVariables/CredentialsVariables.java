package day37_Inheritance.CredentialsVariables;


public class CredentialsVariables {

    private String username, password;

    public CredentialsVariables(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public static boolean isStrongPassword(String password){
        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false; //has upper
        boolean r3 = false; //has lower
        boolean r4 = false; //has special char
        boolean r5 = false; // has digit

        char[] chars = password.toCharArray();
        for (char each : chars) {
            if (Character.isUpperCase(each)) {
                r2 = true;
            } else if (Character.isLowerCase(each)) {
                r3 = true;
            } else if (Character.isDigit(each)) {
                r4 = true;
            } else {
                r5 = true;
            }
        }
        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;


        return isStrongPassword;


    }

    @Override
    public String toString() {
        return "CredentialsVariables{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static void main(String[] args) {
        CredentialsVariables credentialsVariables = new CredentialsVariables("qweasdzxc", "1234rqwedasASD3547!@#");
        System.out.println(isStrongPassword(credentialsVariables.password));
        System.out.println(credentialsVariables);

    }


}

/*
isStrongPassWord(): takes an argument of string and verify
if the given string is strong password
Characteristics of strong passwords are:

 */
