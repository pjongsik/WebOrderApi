package kr.co.iquest.order.Common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Utility {

	public static <T> ResultObjects<T> resultObjects(int resultCode, String resultMessage, List<T> resultList) {
		ResultObjects<T> resultObjects = new ResultObjects<T>();
				
		resultObjects.setResultCode(resultCode);
		resultObjects.setResultMessage(resultMessage);
		resultObjects.setResultList(resultList);
		
		return resultObjects;
	}
	
	public static Date ConvertToDate(String yyyyMMdd) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date date = null;
		
		try {
			date = sdf.parse(yyyyMMdd);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}
}
