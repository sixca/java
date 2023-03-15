package com.kbstar.frame;
//특정코드를 입력하면 그 코드에 해당하는 문자열을 출력해주는 유틸
public class MakeMessage {
	public static String makeMessage(String code) {
		String result = "";
		switch(code) {
		case "EX0007" : result = "중복 상품 ID"; break;
		case "EX0008" : result = "해당 상품 ID 삭제 불가"; break;
		case "EX0009" : result = "해당 상품 ID 수정 불가"; break;
		default: result = "고객센터에 문의하세요";
		}
		return result;
	}
}
