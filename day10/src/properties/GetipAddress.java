package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetipAddress {
	//ip에 대해서만 가져오는 유틸리티를 만들어보자
	public static String getIpAddress() {
		String ipAddr = "";
		Properties props = new Properties();
		String fileName = "file.txt";
		try(FileInputStream in = new FileInputStream(fileName)) {
			props.load(in);
		} catch (IOException e) {
			System.out.println("문제 발생 !!!");
		} 
		ipAddr = props.getProperty("IP_ADDR");
		return ipAddr;
	}
}
