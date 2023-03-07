package bank;

import java.util.Calendar;

public class MakeAccountNumber {
	public static String makeAccNo() {
		String accNo = "";
		Calendar cal = Calendar.getInstance();
		accNo = "" + cal.get(Calendar.YEAR)
					+ (cal.get(Calendar.MONTH)+1)
					+ cal.get(Calendar.DAY_OF_MONTH)
					+ cal.get(Calendar.MILLISECOND);		
		return accNo;
	}
}
