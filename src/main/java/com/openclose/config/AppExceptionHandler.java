package com.openclose.config;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.openclose.bean.ExceptionInfo;

@ControllerAdvice
public class AppExceptionHandler
{
	private static Logger log = LoggerFactory.getLogger(AppExceptionHandler.class);

	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<ExceptionInfo> handleNullPointerException(final HttpServletRequest request, final NullPointerException ne)
	{
		log.error("Exception occured: ", ne);
		ExceptionInfo exInfo = new ExceptionInfo(Constants.MSG_EXCEPTION_MESSAGE, request.getRequestURL().toString(),
				HttpStatus.INTERNAL_SERVER_ERROR);
		return new ResponseEntity<ExceptionInfo>(exInfo, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ExceptionInfo> handleException(final HttpServletRequest request, final Exception e)
	{
		log.error("Exception occured: ", e);
		ExceptionInfo exInfo = new ExceptionInfo(Constants.MSG_EXCEPTION_MESSAGE, request.getRequestURL().toString(),
				HttpStatus.INTERNAL_SERVER_ERROR);
		return new ResponseEntity<ExceptionInfo>(exInfo, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
