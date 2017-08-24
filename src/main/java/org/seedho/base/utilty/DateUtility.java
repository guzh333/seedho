package org.seedho.base.utilty;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 
* @ClassName: DateUtilty 
* @Description: 通用时间转换工具类
* @author seedho/guzh
* @date 2017年8月24日 上午10:48:02 
*
 */
public class DateUtility {
	
	private static final Calendar calendar = Calendar.getInstance();
	public static final String FORMAT_YYYYMMDD = "yyyyMMdd";
	public static final String FORMAT_YYYY_MM_DD = "yyyy-MM-dd";
	public static final String FORMAT_DATETIME = "yyyy-MM-dd HH:mm:ss";
	
	/**
	* @Title: String2Date 
	* @Description: 将一个字符串转时间(转date)
	* @param @param str 时间格式字符串
	* @param @param fomat	字符串所使用的格式
	* @param @return    设定文件 
	* @return Date    返回类型 
	* @throws
	 */
	public static Date String2Date(String str,String fomat)
	{
		SimpleDateFormat sdf = new SimpleDateFormat(fomat);
		if(StringUtility.isNullOrEmpty(str))
		{
			return null;
		}
		try {
			Date date = sdf.parse(str);
			return date;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	* @Title: Date2String 
	* @Description: 将一个时间转换成string类型(转string) 
	* @param @param date 需要转换的时间
	* @param @param format 转换最后展示的效果
	* @param @return    设定文件 
	* @return String    返回类型 
	* @throws
	 */
	public static String Date2String(Date date,String format)
	{
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		if(null == date)
		{
			return null;
		}
		return sdf.format(date);
	}
	
	/**
	* @Title: DateAddDays 
	* @Description: 在某个时间对象中添加指定的天数。
	*     如果在时间添加一个365天，日历控件自动计算闰年闰月应有的天数
	* @param @param date 指定的时间对象
	* @param @param days 添加的天数
	* @param @return    设定文件 
	* @return Date    返回类型 
	* @throws
	 */
	public static Date DateAddDays(Date date, int days)
	{
		if(null == date)
		{
			return null;
		}
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, days);
		return calendar.getTime();
	}
}
