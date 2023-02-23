package variable;



public class P69 {
//다양한 API 활용해보기. 참조자료형의 대표격인 String 활용
	public static void main(String[] args) {
		String str = "abcdef";
		str = str.toUpperCase();      
		System.out.println(str);	//ABCDEF
		
		String str2 = str.replace('A', 'Z');
		System.out.println(str2);   //ZBCDEF
		/**/
		int lng = str.length();
		System.out.println(lng);    //6   :: str의 문자열 갯수

		int t = str.indexOf("B");
		System.out.println(t);      //1   :: "B"의 순서
		
		char c = str.charAt(4);
		System.out.println(c);      //E 4번째 Char
		
		String str3 = str.substring(1, 3);
		System.out.println(str3);      // BC 
		
		String email = "sixca0520@gmail.com";
				
		String id = "";
		String domain = "";
		
		System.out.printf("%s , %s",id,domain);
 	}

}
