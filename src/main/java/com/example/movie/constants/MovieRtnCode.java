package com.example.movie.constants;

public enum MovieRtnCode {

	SUCCESSFUL("200", "琩高Θ!!"), 
	MOVIE_EMPTY("400", "璶琩高筿紇嘿ぃ琌!!"),
	MOVIE_EXIST("400","琩高筿紇ぃ!!"),
	TYPE_EMPTY("400", "璶琩高筿紇摸ぃ琌!!"),
	TYPE_EXIST("400","琩高摸ぃ!!"),
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
