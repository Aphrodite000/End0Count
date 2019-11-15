import java.util.Scanner;

public class Main {
    public static void main(String[] agrs){
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        StringBuilder b=new StringBuilder();
        for(int i=a.length()-1;i>=0;i--){
            b.append(a.charAt(i));
        }
        System.out.println(b);
    }
}
