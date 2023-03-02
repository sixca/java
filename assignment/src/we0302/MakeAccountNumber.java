package we0302;

import java.util.Calendar;
import java.util.Random;

public class MakeAccountNumber {
	public static String makeAccNum() {
		String accNum = "";
		Calendar cal = Calendar.getInstance();
		accNum = "" + cal.get(Calendar.YEAR) + (cal.get(Calendar.MONTH) + 1) + cal.get(Calendar.DAY_OF_MONTH)
				+ cal.get(Calendar.MILLISECOND) + (new Random().nextInt(9000) + 1000); // 난수 4자리 추가
		return accNum;
	}
}
