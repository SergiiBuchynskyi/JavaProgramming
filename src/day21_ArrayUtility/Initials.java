package day21_ArrayUtility;

public class Initials {
    public static void main(String[] args) {

        String []names = {"Sakh sdg","Adjhas bd",":Lkl ahsd","NDJY ASvdsa","SAD ssda","DAS adsa","dSDwq ad"};

        for (String name : names) {
            String initial = name.charAt(0)+""+name.charAt(name.indexOf(" ")+1);
            System.out.println(initial);
        }




    }

}
