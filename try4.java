import java.util.Scanner;
class InvalidCountryException extends Exception{
    public InvalidCountryException(String s){
        super(s);
    }
}

public class try4 {
    public static void main(String[] args) throws InvalidCountryException{
        Scanner sc = new Scanner(System.in);
        String s = sc.next().split(",")[1];
        
        if (!s.equalsIgnoreCase("india")) {
            throw new InvalidCountryException("User outside india can not be registered");
        } else {
            System.out.println("User registration done successfully");
        }
    }
}
