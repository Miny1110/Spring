package com.test1;

public class LoginAuthenticatorImpl implements Authenticator{

	@Override
	public void authen(String userId, String userPwd) throws UserException {
		
		if(!userId.equals("kim") || !userPwd.equals("1234")) {
			
			throw new UserException("Invaild id: " + userId);
			
		}
	}

}
