package ifcontrol;

public class P90 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 15;
		
		//세가지 수의 최대 값과 최소 값을 구하시오
		int max = 0;
		int min = 0;

		//case 1
	    if (a >= b && a >= c) {
	        max = a;
	        if (b >= c) {
	            min = c;
	        } else {
	            min = b;
	        }
	    } else if (b >= a && b >= c) {
	        max = b;
	        if (a >= c) {
	            min = c;
	        } else {
	            min = a;
	        }
	    } else if (c >= a && c >= b) {
	        max = c;
	        if (a >= b) {
	            min = b;
	        } else {
	            min = a;
	        }
	    }
	    
	    //삼항연산자로 변환
	

	    //case2.
	    if(a > b) {
	    	max = a;
	    	min = b;
	    	if(a<c) {
	    		max = c;
	    	}else {
	    		if(a > c) {
	    			min = c;
	    		}
	    	}
	    }else {
	    	max = b;
	    	min = a;
	    	if(b<c) {
	    		max = c;
	    	}else {
	    		if(a>c) {
    			min = a;	
	    		}
	    	}
	    }
	    
	    
	    //삼항연산자로 변환
	    max = (a>b)? ((a>c)? a:c) : (b>c)? b:c;
	    min = (a<b)? ((a<c)? a:c) : (b<c)? b:c; 
	    
	    //max = Math.max(max, b) 함수를 활용해보자
	    if(a>b) {
	    	max = Math.max(a, c);   //the smaller of a and c.
			min = Math.min(b, c);   //the smaller of b and c.
	    }else {
	    	max = Math.max(b, c);
	    	min = Math.min(a, c);
	    }
  		
	    	    
	    System.out.printf("MAX: %d, MIN: %d", max, min);
	}
}