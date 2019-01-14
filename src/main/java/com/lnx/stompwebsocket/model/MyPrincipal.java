package com.lnx.stompwebsocket.model;

import java.security.Principal;

public class MyPrincipal implements Principal{

	private String key;
	
	public MyPrincipal(String key) {
		this.key = key;
	}
	
	@Override
	public String getName() {
		return key;
	}

}
