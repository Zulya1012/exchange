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
   System.out.println ("Error:Ne mojet bit v minuse");
}
else {
  System.out.println ("Error:Ne mojet bit raven 0");
}

}
   }