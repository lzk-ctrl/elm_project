package com.neusoft.elm.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CommonUtil {
	public static String getCurrentDate() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar calendar = Calendar.getInstance();
		return simpleDateFormat.format(calendar.getTime());
	}
}