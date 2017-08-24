package org.seedho.base.utilty;

import com.alibaba.dubbo.common.json.JSON;

/**
 * 
 * @ClassName: JsonUtility 
 * @Description: json转换工具类 
 * @author seedho/guzh
 * @date 2017年8月24日 下午2:47:37 
 *
 */
public class JsonUtility {

	private JsonUtility(){};
	
	public static String toJsonString(Object obj) throws Exception{
		return JSON.json(obj);
	}
}
