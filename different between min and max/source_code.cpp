import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    
	    
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the length of the array:");
      int length = s.nextInt();
      int [] myArray = new int[20];
      System.out.println("Enter the elements of the array:");
 
      for(int i=0; i<length; i++ ) 
      {
         myArray[i] = s.nextInt();
      }
       int [] myArray1 = new int[length];    
       for(int i=0; i<length; i++ ) 
      {
         myArray1[i] = myArray[i];
      }  
	
	
		System.out.println("Original Array: "+Arrays.toString(myArray1)); 
	int max_val = myArray[0];
	int min = myArray[0];
	for(int i = 1; i < length; i++)
	{
		if(myArray[i] > max_val)
			max_val = myArray[i];
		else if(myArray[i] < min)
			min = myArray[i];
	}
	System.out.println("Difference between the largest and smallest values of the said array: "+(max_val-min));
     }            
 
 
	}
