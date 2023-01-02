package com.example.RESTAPI.RESTAPIDEMO.exception;

import java.time.LocalDate;

public class ErrorDetails 
{
	//timestamp
	//message
	//details
	private LocalDate timestamp;
	private String message;
	private String Details;
	public ErrorDetails(LocalDate timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		Details = details;
	}
	public LocalDate getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDate timestamp) {
		this.timestamp = timestamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetails() {
		return Details;
	}
	public void setDetails(String details) {
		Details = details;
	}
	

}
