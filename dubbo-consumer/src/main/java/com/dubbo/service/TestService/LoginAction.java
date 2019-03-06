package com.dubbo.service.TestService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;
import org.dubbo.service.TestService;
import org.dubbo.util.PrintUtil;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

/**
 * action测试
 * @author HXL
 * @since 2017-11-2 上午10:35:34
 */

public class LoginAction extends ActionSupport{

	@Autowired
	private TestService service;
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String execute() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
        HttpServletResponse response = ServletActionContext.getResponse();
		
		String  name = service.sayHello("123");
		
		PrintUtil.printJSONObject(response, JSONObject.fromObject(name));
		return null;
	}
}
