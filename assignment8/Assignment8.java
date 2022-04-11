import java.util.regex.*;
import java.util.Scanner;

class invalidEmail extends Exception{
    public invalidEmail(String str){
        super(str);
    }
};

class invalidPassword extends Exception{
    public invalidPassword(String str){
        super(str);
    }
};

class invalidPasswordMatch extends Exception{
    public invalidPasswordMatch(String str){
        super(str);
    }
};


class verify extends Exception{

    public void CheckDetails(String email,String password,String reenteredPassword)throws invalidEmail,invalidPassword,invalidPasswordMatch {
        String regex="^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(email);
        if(!matcher.matches()){
            throw new invalidEmail("Invalid Email");
        }
        if(password.length()!=5)
        {
            throw new invalidPassword("Password must contain atleast 5 letters");
        }
        if(password.equals(reenteredPassword)){
            throw new invalidPasswordMatch("Passwords donot match");
        }
    }
};

class Assignment8 {
    public static void main(String[] args) {
        try {
            verify obj = new verify();
            String email,password,reenteredPassword;
            Scanner in = new Scanner(System.in);
            System.out.println("Email");
            email = in.nextLine();
            System.out.println("Password");
            password = in.nextLine();
            System.out.println("Re-enter Password");
            reenteredPassword = in.nextLine();
            obj.CheckDetails(email,password,reenteredPassword);
        }
        catch(invalidEmail | invalidPassword | invalidPasswordMatch e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Finally Block");
        }

    }

}