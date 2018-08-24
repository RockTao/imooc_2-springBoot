package com.rock.domain;


/**
 * http请求返回的最外层对象
 * @author root
 * date: Aug 24, 2018 10:47:21 PM.<br/>
 * @param <T>
 */


public class Result<T> {
	//错误码
	private Integer code;
	////提示内容
	private String mString;
	
	//具体的内容
	private T data;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getmString() {
		return mString;
	}

	public void setmString(String mString) {
		this.mString = mString;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
	
}
