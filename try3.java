import java.util.InputMismatchException;
import java.util.Scanner;
class valueoutofrange extends Exception{
    public valueoutofrange(String s){
        super(s);
    }
}
public class try3 {
    public static void main(String[] args) throws valueoutofrange {
        String s1,s2;
        Scanner sc = new Scanner(System.in);
        int m1[] = new int[3];
        int m2[] = new int[3];
        
            System.out.println("enter name of first student");
            s1 = sc.nextLine();
            System.out.println("enter the marks");
            try{
            for (int i = 0; i < 3; i++) {
                m1[i] = sc.nextInt();
                try{
                if(m1[i]<0 || m1[i]>100){
                    
                    throw new valueoutofrange("marks can only be in the range of [0-100]");
                    }
                }
                catch(valueoutofrange e){
                    System.out.println(e);
                }
            }
        }
        catch (InputMismatchException e) {
            System.out.println(e);
        }
            sc.nextLine();
            System.out.println("enter name of second student");
            s2 = sc.nextLine();
            System.out.println("enter the marks");
            try{
            for (int i = 0; i < 3; i++) {
                m2[i] = sc.nextInt();
                try{
                if(m2[i]<0 || m2[i]>100){
                    throw new valueoutofrange("marks can only be in range of [0-100]");
                }
            }
            catch(valueoutofrange e){
                System.err.println(e);
            }
            }
        }
         catch (InputMismatchException e) {
            System.out.println(e);
        }
    } 
}  

