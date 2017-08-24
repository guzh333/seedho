package org.seedho.base.exception;

/**
 * 
 * @ClassName: ApplicationException 
 * @Description: 通用异常基类 
 * @author seedho/guzh
 * @date 2017年8月24日 下午5:21:52 
 *
 */
public class ApplicationException extends Exception{

	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	 */ 
	private static final long serialVersionUID = 1L;
	
	protected int errorId;

	public ApplicationException(int errorId,String message)
	{
		super(message);
		this.errorId = errorId;
	}
	
	public ApplicationException(int errorId)
	{
		this.errorId = errorId;
	}
	
	public ApplicationException(Throwable e)
	{
		super(e);
	}
	
	public ApplicationException(String errorMessage)
	{
		super(errorMessage);
	}
	
}
