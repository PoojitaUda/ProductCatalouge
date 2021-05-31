package com.hcl.product.dto;

public class ResponseDto {
	
	private String message;
	private Integer statusCode;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Integer getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}
	@Override
	public String toString() {
		return "ResponseDto [message=" + message + ", statusCode=" + statusCode + "]";
	}
	
	
	

}
