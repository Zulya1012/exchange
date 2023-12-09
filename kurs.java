import java.util.Scanner;
 
public class kurs {
    public static void main(String[] args) {
    float x=1.7F;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dollar : ");
        int a=sc.nextInt();
        
    

       double c=a*x;
     
if (c>0) {

   System.out.println(c);
}
else if (c<0) {
   System.out.println("error:can't be less than 0");
}
else {
    System.out.println("error: can't be  equal to  0");
}
    
}
 
  
}
