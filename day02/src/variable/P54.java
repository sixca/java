package variable;

public class P54 {

	public static void main(String[] args) {
		// boolean
		boolean b1 = 10 > 5;
		System.out.println(b1);
		
		// 정수 :: 정수의 기본값은 int
		int a = 10;
		long n2 = 20000000000000000L;		
		
		//실수 :: 실수의 기본값은 double
		double d1 = 1.0;
		float f1 = 1.0F;
		
		double d2 = 1/2;
		System.out.println(d2);    //0.0   *정수로 인식*
		
		double d3 = 10.0/3.0;
		System.out.println(d3);    //3.3333333333333335
		
		float f2 = 10.0F/3.0F;
		System.out.println(f2);    //3.3333333

		//char
		char c1 = 'A';
		System.out.println(c1);    //A  문자 저장 시 작은 따옴표 사용

		char c2 = 65;
		System.out.println(c2);    //A  유니코드표에 해당하는 문자 출력

		// 기본 자료형 간의 연산
		int n3 = 10;
		double n4 = 10.0;
		double result = n3 + n4;
		System.out.println(result);  // 20.0
		
		
	}

}
