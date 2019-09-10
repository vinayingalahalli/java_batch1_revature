package validation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ValidateDate {

	public static void main(String[] args) {

		String s = "10.10.2010";

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		sdf.setLenient(false);
		// public Date parse(Stringobject) throws ParseException
		boolean b = false;
		Date d = null;
		if (s.matches("[0-3]{1}[0-9]{1}-[0-9]{2}-[0-9]{4}")) {
			try {
				d = sdf.parse(s);
				b = true;
				// System.out.println("Valid date "+d);
			} catch (ParseException e) {
				// System.out.println("Invalid date entered");
			}
		}
		if(b) {
			System.out.println("Valid date "+d);
		}else {
			System.out.println("Invalid date");
		}
	}

}