package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test2 {

	public static void main(String[] args) {
		//콜렉션프레임워크 Map 계열의 Properties 활용
		Properties props = new Properties();
		String fileName = "file.txt";
		try(FileInputStream in = new FileInputStream(fileName)) { //예외발생 여부와 관계없이 try-catch완료 후 자동으로 .close() 실행 ::리소스 자동해제 예외 처리 P224
			props.load(in);
		} catch (IOException e) {
			System.out.println("문제 발생 !!!");
			return;          //문제가 발생하면 여기서 끝내라
		} 
		String ip = props.getProperty("IP_ADDR");
		int port = Integer.parseInt(props.getProperty("PORT"));
		System.out.printf("%s 서버로 %d 포트로 접속..",ip,port);
	}

}
