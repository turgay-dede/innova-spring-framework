package com.innova.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@InterceptorService
@Interceptor
public abstract class MethodInterceptor { // beans.xml eklendi
	
	@AroundInvoke
	public Object aroundInvoke(InvocationContext invocation) throws Exception {
		
		System.out.println("Interceptor start! " + invocation.getMethod());
		boolean isLogin = true;
		Object isContinue = null;
		if (isLogin) {
			System.out.println("Please, you must be register");
			return null;
		}
		
		try {
			isContinue = invocation.proceed();
			System.out.println("After login.. You are edirect to admin page");
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return isContinue;
	}
	
}
