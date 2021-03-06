package com.documentsmanager.model;

import java.io.Serializable;

/**
 * @author Kaan
 *
 */
public class Source implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String name;
	private String id;
	private String url;
	
	public Source() {
		// TODO Auto-generated constructor stub
	}

	public Source(String name, String id, String url) {
		this.name =name;
		this.id = id;
		this.url = url;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
