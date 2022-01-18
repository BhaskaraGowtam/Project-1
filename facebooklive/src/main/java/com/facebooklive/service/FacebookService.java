package com.facebooklive.service;

import java.util.List;

import com.facebooklive.dao.FacebookDAOInterface;
import com.facebooklive.entity.FacebookUser;
import com.facebooklive.entity.TimeLine;
import com.facebooklive.utility.DAOFactory;

public class FacebookService implements FacebookServiceInterface {
	private FacebookDAOInterface fd;
	public FacebookService() {
		fd=DAOFactory.createObject();
	}

	@Override
	public int createProfileService(FacebookUser fb) {
		// TODO Auto-generated method stub
		return fd.createProfileDAO(fb);
	}

	@Override
	public int loginProfileService(FacebookUser fb) {
		// TODO Auto-generated method stub
		return fd.loginProfileDAO(fb);
	}

	@Override
	public List<TimeLine> timeLineService(FacebookUser fb) {
		// TODO Auto-generated method stub
		return fd.timelineDAO(fb);
	}

	@Override
	public FacebookUser viewProfileService(FacebookUser fb) {
		// TODO Auto-generated method stub
		return fd.viewProfileDAO(fb);
	}

	@Override
	public int editprofileService(FacebookUser fb) {
		// TODO Auto-generated method stub
		return fd.editProfileDAO(fb);
	}

	@Override
	public int deleteProfileService(FacebookUser fb) {
		// TODO Auto-generated method stub
		return fd.deleteProfileDAO(fb);
	}

}
