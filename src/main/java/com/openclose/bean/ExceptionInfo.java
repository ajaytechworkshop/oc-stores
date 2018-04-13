package com.openclose.bean;

import org.springframework.http.HttpStatus;

public class ExceptionInfo
{
	private String message;
	private String requestUrl;
	private HttpStatus httpStatus;

	public ExceptionInfo()
	{

	}

	public ExceptionInfo(String message, String requestUrl, HttpStatus httpStatus)
	{
		this.message = message;
		this.requestUrl = requestUrl;
		this.httpStatus = httpStatus;
	}

	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

	public String getRequestUrl()
	{
		return requestUrl;
	}

	public void setRequestUrl(String requestUrl)
	{
		this.requestUrl = requestUrl;
	}

	public HttpStatus getHttpStatus()
	{
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus)
	{
		this.httpStatus = httpStatus;
	}

}
