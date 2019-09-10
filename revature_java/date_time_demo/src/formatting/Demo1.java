package formatting;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo1 {

	public static void main(String[] args) {
		/*
		 *    dd - date in 2 digits     6 ->06       d->6->6   20->20
		 *    MM - Month in 2 digits    MMM-Aug     MMMM->August
		 *    yy - last 2 digits of year       yyyy- full year
		 *    EEE - short name of day -> Thu          EEEE-Thursday
		 *    hh - 12 hour
		 *    HH - 24hour
		 *    mm- mins
		 *    ss - seconds
		 *    z/Z - zone/GMT
		 *    a - AM/PM
		 *    
		 */
		
		Date d=new Date();
		System.out.println(d);
		
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yy EEE   hh:mm:ss a  z Z   EEEE  MMMM");
		System.out.println(sdf.format(d));         // public String format(dateobject)
		
		
		System.out.println(d);
		

	}

}