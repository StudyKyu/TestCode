package com.example.oop;

public class WrongFixedPasswordGenerator implements PasswordGenerator {

	@Override
	public String generatePassword() {
		return "abc";
	}

	
}
