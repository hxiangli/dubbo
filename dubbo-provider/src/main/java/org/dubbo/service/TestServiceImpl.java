package org.dubbo.service;

/**
 * 测试用例
 * @author HXL
 * @since 2017-11-2 上午10:24:03
 */
public class TestServiceImpl implements TestService{

	@Override
	public String sayHello(String name) {
		
		System.out.println("2222222222:"+name);
		return name;
	}

	@Override
	public String sayHello2(String name) {
		System.out.println("3333333333:"+name);
		return name;
	}

}
