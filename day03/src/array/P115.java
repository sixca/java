package array;

public class P115 {
//메모리구조를 그려보라 ( /stack /heap) 
	public static void main(String[] args) {
		String strs[] = new String[3];
		strs[0] = "abc";
		strs[1] = "def";
		strs[2] = "ghi";
		
		for(int i=0; i<strs.length;i++) {
			System.out.println(strs[i]);
		}
		
	}

}
