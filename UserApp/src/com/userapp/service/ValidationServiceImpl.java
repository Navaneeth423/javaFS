package com.userapp.service;
import com.userapp.exception.*;

public class ValidationServiceImpl implements IValidationService {

	@Override
	public boolean validatePassword(String password) throws TooLongException, TooShortException{
		if(password.length() < 6) {
			throw new TooShortException("Password too Short");
		} else if (password.length() > 15) {
			throw new TooLongException("Password too Long");
		}
		return true;
	}

	@Override
	public boolean validateUsername(String username) throws NameExistsException{
		String[] usernames = {"Sri", "Priya", "Joe", "Kathy"};
		for(String user : usernames) {
			if(username.equalsIgnoreCase(user)) {
				throw new NameExistsException("Name already exists");
			}
		}
		return true;
	}

}
