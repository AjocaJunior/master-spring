package com.ajocasol.webappspring.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	//say-hello => Hello, etc...
	// localhost:8080/say-hello
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello, what are you learning today?";
	}

	// localhost:8080/say-hello
		@RequestMapping("say-hello-html")
		@ResponseBody
		public String sayHelloHtml() {
			StringBuffer sb =new StringBuffer();
			sb.append(" <!DOCTYPE html>");
			sb.append("<head>");
			sb.append(" <title>Hello HTML in Java</title>");
			sb.append("</head>");
			sb.append("<body>");
			sb.append(" <p>My first paragraph in Java+Html.</p>");
			sb.append(" </body>");
			sb.append(" </html> ");
			return sb.toString();
		}
}
