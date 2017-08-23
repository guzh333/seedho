package seedho.SeedHoDubboClient;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboProviderMain {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				new String[]{"applicationProvider.xml"});
		ctx.start();
		System.out.println("press any key to exti.");
		System.in.read();
	}
}
