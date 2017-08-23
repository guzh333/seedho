package seedho.SeedHoDubboClient;

public class HelloWorldImpl implements HelloWorld
{

	public String hello(String name) 
	{
		name = name + "seedHo Test";
		return name;
	}
	
}
