package day02;

public class P55 {
// 타입변환 과제
 	  public static void main(String[] args) { 
		   int a = 2000000000; 
		   int b = 2000000000; 
		  
		   Long aLong= new Long(a);
		   Long bLong= new Long(b);
		   System.out.print(aLong + bLong);
		  
		  } 

//case.2
 	   /* public static void main(String[] args) { 
		   int a = 2000000000; 
		   int b = 2000000000; 
		  
		   Long aLong= Long.valueOf(a);
		   Long bLong= Long.valueOf(b);
		   System.out.print(aLong + bLong);
		  
		  } */
 	  
//case.3	  
	  /*public static void main(String[] args) { 
	   int a = 2000000000; 
	   int b = 2000000000; 
	   System.out.print((long)a + b);
	  
	  }  */	  
 	  
//case.4	 
	/*public static void main(String[] args) {     
		int a = 2000000000;                      
		int b = 2000000000;                      
		System.out.printf("%.0f", (double)a + b);
                                                 
	} */   
	
//case.5
	/*public static void main(String[] args) {  
  		int a = 2000000000;                   
		int b = 2000000000;                   
   		long c = a;                           
		long d = b;                           
      	System.out.print(c + d);              
                                                   
     }   */   
	
 }
