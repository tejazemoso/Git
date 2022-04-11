import java.util.Scanner;

public class Assignment2{
    public static boolean check(String input){
        long c= input.toLowerCase().chars()
                .filter(ch->ch>='a' && ch<='z')
                .distinct()
                .count();
        return c==26;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER ANY STRING");
        String str =in.nextLine();
        boolean result=Assignment2.check(str);
        if(result){
            System.out.println("String contains all alphabets");
        }
        else{
            System.out.println("String donot contain all alphabets");
        }
    }
}