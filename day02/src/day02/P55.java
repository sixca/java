package day02;

public class P55 {
// 타입변환 과제
//case.1 
 	   public static void main(String[] args) {
 	        
 	        int a = 2000000000;
 	        int b = 2000000000;
 	        
 	        Long aLong = new Long(a);
 	        Long bLong = new Long(b);
 	        
 	        long result = aLong.longValue() + bLong.longValue();
 	        System.out.print(result);
 	    }

//case.2 저장 위치에 따라 결과값이 나오기도, 안 나오기도 합니다.
// aLong + bLong에서 객체+객체 연산 불가로 문제가 발생하는 것 같습니다.
// 원본 위치에서는 결과가 잘 출력이 되기도 하는데 다른 프로젝트로 이동하여 출력하면 에러가 뜹니다.
// 되다가, 안 되다가 하는 이유는 무엇일까요? ㅠㅠ  	   
 	  /*public static void main(String[] args) { 
		   int a = 2000000000; 
		   int b = 2000000000; 
		  
		   Long aLong= new Long(a);
		   Long bLong= new Long(b);
		   System.out.print(aLong + bLong);
		  
		  } */
	  
 	   

//case.3 마찬가지로 출력이 되기도, 오류가 뜨기도 합니다.
 	   /* public static void main(String[] args) { 
		   int a = 2000000000; 
		   int b = 2000000000; 
		  
		   Long aLong= Long.valueOf(a);
		   Long bLong= Long.valueOf(b);
		   System.out.print(aLong + bLong);
		  
		  } */
 	  
//case.4	  
	  /*public static void main(String[] args) { 
	   int a = 2000000000; 
	   int b = 2000000000; 
	   System.out.print((long)a + b);
	  
	  }  */	  
 	  
//case.5	 
	/*public static void main(String[] args) {     
		int a = 2000000000;                      
		int b = 2000000000;                      
		System.out.printf("%.0f", (double)a + b);
                                                 
	} */   
	
//case.6
	/*public static void main(String[] args) {  
  		int a = 2000000000;                   
		int b = 2000000000;                   
   		long c = a;                           
		long d = b;                           
      	System.out.print(c + d);              
                                                   
     }   */   
	
 }
