package com.facebooklive.utility;

import com.facebooklive.dao.FacebookDAO;
import com.facebooklive.dao.FacebookDAOInterface;

public class DAOFactory {

	public static FacebookDAOInterface createObject() {
		// TODO Auto-generated method stub
		return new FacebookDAO();
	}

}
