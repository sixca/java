package calculator;
//고객의 화면
public class Ui {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int result = 0;
		result = cal.sum(10,20);
		System.out.println(result);
		cal.save(result);  //public void save니까 리턴없이 result값은 저장만 되는 거지
		System.out.println("OK");
	}

}
