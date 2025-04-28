package com.cafe.exceptions;

public class ErrorHandling{
	private int errCode;
	private String errMessage;
	public int getErrCode() {
		return errCode;
	}
	public void setErrCode(int errCode) {
		this.errCode = errCode;
	}
	public String getErrMessage() {
		return errMessage;
	}
	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}
	public ErrorHandling(int errCode, String errMessage) {
		super();
		this.errCode = errCode;
		this.errMessage = errMessage;
	}
	public ErrorHandling() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ErrorHandling [errCode=" + errCode + ", errMessage=" + errMessage + "]";
	}
	
	
}