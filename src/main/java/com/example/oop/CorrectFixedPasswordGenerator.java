package com.example.oop;

public class CorrectFixedPasswordGenerator implements PasswordGenerator {

	@Override
	public String generatePassword() {
		return "abcdefgh"; // 8자
	}

	
}
