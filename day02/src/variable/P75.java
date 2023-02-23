package variable;

public class P75 {
//증감연산자
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		System.out.printf("%d, %d\n",a,b);
		
		int result = ++a + b++;    //  
		System.out.printf("%d, %d\n",a,b);
		System.out.println(result);  // 21   :: 11+10이 되어버림. ++a + b까지만 계산되어서 result값이 먹음. 
		
		int aa = 10;
		int bb = 10;
		System.out.println( (aa++ >=0) || (bb++ >= 0) );
		System.out.printf("%d,%d\n",aa,bb);                // aa++ >= 0 만 확인하고 참이라 true 출력
		System.out.println( (aa++ >=0) | (bb++ >= 0) );
		System.out.printf("%d,%d\n",aa,bb);					// aa++ >= 0과 뒤에 있는 bb++까지 확인하니 BB값도 ++ 적용
		//보통은 
}
}

