import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println(getStroka(name));
    }

    public static String getStroka(String name){
        String stroka = null;
        if(name.length() != 0){
            stroka = "One for " + name + ", one for me.";
        }
        else{
            stroka = "One for you, one for me.";
        }
        return stroka;
    }
}


