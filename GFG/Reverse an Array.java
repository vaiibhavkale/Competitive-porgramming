import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
     
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        while(t!=0){
            int n=sc.nextInt();
        
            int[] a=new int[n];
            
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                
            }
            
            for (int i=n-1;i>=0;i--){
                System.out.print(a[i]+" ");
            }
            t--;
            System.out.println(); //multiple test cases are available here that why for every other test case we have to print new line
            
        }
        
        sc.close();
        
    }
}
