import java.util.Scanner;

import javax.print.DocFlavor.STRING;
class InvalidCountryException extends Exception{
    public InvalidCountryException(String s){
        super(s);
    }
}

public class try4 {
    public static void main(String[] args) throws InvalidCountryException{
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1[] = s.split(",");
        if (!s1[1].equalsIgnoreCase("india")) {
            throw new InvalidCountryException("User outside india can not be registered");
        } else {
            System.out.println("User registration done successfully");
        }
    }
}