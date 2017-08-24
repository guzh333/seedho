package org.seedho.base.utilty;

/**
 * 
* @ClassName: StringUtilty 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author seedho/guzh
* @date 2017年8月24日 上午10:52:30 
*
 */
public class StringUtility {

	/**
	 * 
	* @Title: isNullOrEmpty 
	* @Description: 判断字符串是否为空 
	* @param @param str
	* @param @return    设定文件 
	* @return boolean    返回类型 
	* @throws
	 */
	public static boolean isNullOrEmpty(String str){
		if(null == str)
		{
			return true;
		}
		if(str.isEmpty())
		{
			return true;
		}
		return false;
	}
}
