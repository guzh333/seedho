package org.seedho.base.constants;

/**
 * 
 * @ClassName: BaseErrorId 
 * @Description: BaseErrorId错误ID使用范围(1-10000) 
 * @author seedho/guzh
 * @date 2017年8月24日 下午2:18:19 
 *
 */
public interface BaseErrorId {
	/** 无错误 */
 	final int ERROR_NONE = 0;
 	
 	/** 数据库连接异常定义范围200-299 */
 	/** 数据库连接异常 */
 	final int ERROR_DB_CONNECTION = 200;
 	
 	/** 数据转换异常 */
 	final int ERROR_DATA_CONVERT = 300;
 	
 	/** 未知异常 */
 	final int ERROR_UNKNOWN = 999;
}
