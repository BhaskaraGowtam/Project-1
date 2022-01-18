package com.facebooklive.utility;

import com.facebooklive.service.FacebookService;
import com.facebooklive.service.FacebookServiceInterface;

public class ServiceFactory {

	public static FacebookServiceInterface createObject() {
		// TODO Auto-generated method stub
		return new FacebookService();
	}

}
