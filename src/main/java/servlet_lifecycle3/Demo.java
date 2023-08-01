package servlet_lifecycle3;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns="/demo",loadOnStartup=1)
public class Demo implements Servlet {
	static{
		System.out.println("Class is Loaded");
	}
public Demo(){
	System.out.println("Object for Demo is Created");
}
public void destroy() {
	System.out.println("destroy method is called");
}
public ServletConfig getServletConfig() {
	// TODO Auto-generated method stub
	return null;
}
public String getServletInfo() {
	// TODO Auto-generated method stub
	return null;
}
public void init(ServletConfig arg0) throws ServletException {
	System.out.println("init method is called");
}

public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
System.out.println("service method is called"); 
}
}
