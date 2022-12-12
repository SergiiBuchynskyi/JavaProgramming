package day11_Switch_Scanner;

public class Browser {
    public static void main(String[] args) {
        String browserName = "chrome";
        String result = "";
        boolean validBrowser = browserName == "chrome" || browserName == "firefox" ||
                browserName == "edge" ||browserName == "opera" ||browserName == "safari";
        if (validBrowser){
            if (browserName == "chrome"){
                result = "Chrome Browser is Selected";
            }else if (browserName == "irefox") {
                result = "Firefox Browser is Selected";
            }else if (browserName == "pera") {
                result = "Opera Browser is Selected";
            }else if (browserName == "safari") {
                result = "Safari Browser is Selected";
            }else {
                result = "Edge Browser is Selected";
            }

        }else {
            result = "Invalid Browser Name";
        }
        System.out.println(result);
    }
}
