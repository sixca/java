package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test {
//안되노 짜발나게 file.txt가 뭔가 잘못된것같은데
	public static void main(String[] args) {
		//콜렉션프레임워크 Map 계열의 Properties 활용
		Properties props = new Properties();
		String fileName = "file.txt";
		FileInputStream in = null;
		try {
			in = new FileInputStream(fileName);
			props.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {   //리소스 자동해제 예외 처리 P224
			try {
				if(in != null) {
					in.close();
				}
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		String ip = props.getProperty("IP_ADDR");
		
		System.out.println(ip);
	}

}
