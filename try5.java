import java.util.Scanner;
class InvalidAge extends Exception{
    public InvalidAge(String s){
        super(s);
    }
}
public class try5 {
    public static void main(String[] args) throws InvalidAge{
        String name = args[0];
        try{
        int age = Integer.parseInt(args[1]);
        if(age<18 || age>=60){
            throw new InvalidAge("Age must be equal and greater than 18 and less than 60");
        }
        else{
            System.out.println("age of "+name+" is "+age);
        }
    }
    catch(NumberFormatException | InvalidAge e){
        System.out.println(e);
    }
    }
}
