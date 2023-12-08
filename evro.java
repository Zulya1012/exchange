import java.util.Scanner;
   public class evro {
     public static void main(String[] args) {
     float x=1.84F;
         Scanner sc=new Scanner (System.in);
        System.out.println("Evro:");
   int a=sc.nextInt();
       

   double c=a*x;

if (c>0) {
   System.out.println(c);
}
else if (c<0) {
  System.out.println("Error:ne mojet bit denqi v minuse");
}
else {
  System.out.println("Error: ne mojet bit raven 0");
}
}

 }