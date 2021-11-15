import java.util.Scanner;
class try1{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
        System.out.println("enter the numebr of elements in the array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter the elements of the array");
        for(int j=0;j<n;j++){
            a[j] = sc.nextInt();
        }
        System.out.println("enter the index of the array element you want to access");
        int i = sc.nextInt();
        int e = a[i];
        System.out.println("The array element at index " + i+" = "+e);
    } catch (Exception e) {
        System.out.println(e);
    }

    }
}