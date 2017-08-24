package org.seedho.base.exception;

import org.seedho.base.constants.BaseErrorId;

/**
 * 
 * @ClassName: DataConvertException 
 * @Description: 数据转换异常 
 * @author seedho/guzh
 * @date 2017年8月24日 下午5:15:31 
 *
 */
public class DataConvertException extends ApplicationException{
	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	 */ 
	private static final long serialVersionUID = 1L;

	public DataConvertException(String errorMessage) {
		super(errorMessage);
		this.errorId = BaseErrorId.ERROR_DATA_CONVERT;
	}


}
