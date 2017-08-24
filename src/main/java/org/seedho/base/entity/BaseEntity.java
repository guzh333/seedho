package org.seedho.base.entity;

import java.util.Date;

import org.seedho.base.utilty.JsonUtility;

/**
 * 
 * @ClassName: BaseEntity 
 * @Description: 通用实体基类 
 * @author seedho/guzh
 * @date 2017年8月24日 下午2:43:43 
 *
 */
public abstract class BaseEntity {
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public int getErrorId() {
		return errorId;
	}
	public void setErrorId(int errorId) {
		this.errorId = errorId;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	protected String createUser;
	protected Date createDate;
	protected String updateUser;
	protected Date updateDate;
	protected int errorId;
	protected String errorMessage;
	
	public BaseEntity()
	{
		updateDate = new Date();
	}
	
	@Override
	public String toString() {
		try {
			return JsonUtility.toJsonString(this);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
}
