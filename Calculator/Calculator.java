import java.util.*;
public class cal{
    private int num1;
    private int num2;
    public cal(int n1,int n2)
    {
        num1=n1;
        num2=n2;
        
    }

     public void fun()
     {
         
           System.out.println("<--calculator operation-->");
            System.out.println("addition of  "+num1+" and "+num2+" is :");
            System.out.println(add(num1, num2));
            
            System.out.println("Substraction of  "+num1+" and "+num2+" is :");
            System.out.println(sub(num1, num2));
            
            System.out.println("Multiplocation of  "+num1+" and "+num2+" is :");
            System.out.println(mul(num1, num2));
            
            System.out.println("division of  "+num1+" and "+num2+" is :");
            System.out.println(div(num1, num2));
         

     }
    
    private static long add(int op1, int op2) {
        return (long)op1 + op2;
    }
    
    private static long sub(int op1, int op2) {
        return (long)op1 - op2;
    }
    
    private static long mul(int op1, int op2) {
        return (long)op1 * op2;
    }
    
    private static long div(int op1, int op2) {
        return (long)op1 / op2;
    }
    public static void main(String[] args) {
        cal obj= new cal(10,5);
            obj.fun();
    }
    
    
}
