package org.seedho.base.startup;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * 
 * @ClassName: startUp 
 * @Description: 通用入口, 
 * @author seedho/guzh
 * @date 2017年8月24日 下午5:18:48 
 *
 */
public class startUp {
	public static void main(String[] args) throws IOException 
	{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				new String[]{"applicationProvider.xml"});
		ctx.start();
		System.out.println("press any key to exti.");
		System.in.read();
	}
}
