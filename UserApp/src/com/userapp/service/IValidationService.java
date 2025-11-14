package com.userapp.service;
import com.userapp.exception.*;

public interface IValidationService {
	boolean validatePassword(String password) throws TooShortException, TooLongException;
	boolean validateUsername(String username) throws NameExistsException;
}
