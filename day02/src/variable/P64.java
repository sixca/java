package variable;

public class P64 {

	public static void main(String[] args) {
		int a= 10;		
		double d = 10.2365;
		String str1 = "abc";
		String str2 = "abc";
		System.out.printf("%d %.2f %s \n",a,d,str1);
		if(str1 == str2) {
			System.out.println("ok");     //ok
		}
		if(str1.equals(str2)) {
			System.out.println("ok");     //ok
		}
		String str3 = new String ("abc");
		String str4 = new String ("abc");
		if(str3 == str4) {
			System.out.println("ok");     //ok  ->  값이 abc로 같으니 ok
		}
		if(str3.equals(str4)) {
			System.out.println("ok");     //실패  -> stack 번지수가 달라서 다르게 인식
		}
	}

}
