import java.util.*;

class hw{
    public static void main(String[] args){
        String b= "Java";
        ArrayList<String> languages= new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("HTML");
        System.out.println("---Array List--- \n");
        languages.forEach((e) -> {System.out.println(e);});
        languages.forEach((n) -> {if (n.equals(b)) System.out.println("Java is found");});
    }
}
