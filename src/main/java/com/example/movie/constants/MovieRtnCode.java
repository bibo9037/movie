package com.example.movie.constants;

public enum MovieRtnCode {

	SUCCESSFUL("200", "�d�ߦ��\!!"), 
	MOVIE_EMPTY("400", "�n�d�ߪ��q�v�W�٤���O�Ū�!!"),
	MOVIE_EXIST("400","�d�ߪ��q�v���s�b!!"),
	TYPE_EMPTY("400", "�n�d�ߪ��q�v��������O�Ū�!!"),
	TYPE_EXIST("400","�d�ߪ��������s�b!!"),
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
