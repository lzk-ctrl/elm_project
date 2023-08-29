package com.neusoft.elm.framework;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;

@WebServlet("/") // 拦截所有请求
public class DispatcherServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 处理中文乱码
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8");// 返回json格式

		// 获取请求路径
		String path = request.getServletPath();
		// 解析路径
		String className = path.substring(1, path.lastIndexOf("/"));
		String methodName = path.substring(path.lastIndexOf("/") + 1);
		PrintWriter out = null;
		try {
			Class clazz = Class.forName("com.neusoft.elm.controller." + className);// 类全名
			Object controller = clazz.newInstance();
			Method method = clazz.getMethod(methodName, new Class[] { HttpServletRequest.class });
			Object result = method.invoke(controller, new Object[] { request });
			out = response.getWriter();
			ObjectMapper om = new ObjectMapper();
			out.print(om.writeValueAsString(result));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("DispatcherServlet信息：请求url：" + path);
			System.out.println("DispatcherServlet信息：类名：" + className + "\t方法名：" + methodName);

		} finally {
			out.close();
		}

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
}
