package com.svam.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

@Component
public class CORSFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
	    HttpServletResponse resp = (HttpServletResponse) response;

	    resp.setHeader("Access-Control-Allow-Origin", req.getHeader("Origin"));
	    resp.setHeader("Access-Control-Allow-Credentials", "true");
	    resp.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
	    resp.setHeader("Access-Control-Max-Age", "3600");
	    resp.setHeader("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With, remember-me");

	    chain.doFilter(req, resp);
		
	}

}
