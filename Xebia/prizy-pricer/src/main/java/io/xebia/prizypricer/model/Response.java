package io.xebia.prizypricer.model;

public class Response {
	
	private int status;
	private Object data;
	
	public Response(int status, Object data) {
		this.status = status;
		this.data = data;
	}
	
	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
	
	public Object getData() {
		return data;
	}
	
	public void setData(Object data) {
		this.data = data;
	}
	
}
