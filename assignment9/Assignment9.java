import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Assignment9
{
    public void Check(String s1) {
        String regexPattern="[A-Z].*[.]";
        boolean flag=Pattern.matches(regexPattern, s1);
        if(flag){
            System.out.println("The given pattern matches the regex");
        }
        else{
            System.out.println("The given pattern does not matches the regex");
        }
    }

    public static void main(String[] args)
    {
        String s1;
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter the string: ");
        s1 = in.nextLine();
        Assignment9 obj = new Assignment9();
        obj.Check(s1);
    }
}