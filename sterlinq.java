import java.util.Scanner;
  public class sterlinq {
    public static void main(String[] args) {
 float x=2.04F;
  Scanner s=new Scanner(System.in);
   System.out.println("Sterlinq:");
int a=s.nextInt();
  
 double c=a*x;

if (c>0) {
   System.out.println (c);
}
else if (c<0) {
   System.out.println ("Error:can't be less than 0");
}
else {
  System.out.println ("Error: can't be equal to 0");
}

}
   }
