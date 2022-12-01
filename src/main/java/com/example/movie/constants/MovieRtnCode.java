package com.example.movie.constants;

public enum MovieRtnCode {

	SUCCESSFUL("200", "成功!!"), 
	EMPTY("400", "要查詢的電影名稱不能是空的!!"),
	EXIST("400","查詢的電影不存在!!"),

	;

	private String code;

	private String message;

	private MovieRtnCode() {

	}

	private MovieRtnCode(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
