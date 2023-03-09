package properties;

public class Test3 {
//getipAddress클래스 유틸리티를 만들어서 간편하게 코딩
	public static void main(String[] args) {
		String ipAddr = GetipAddress.getIpAddress();
		System.out.printf("%s로 접속..", ipAddr);
	}

}
