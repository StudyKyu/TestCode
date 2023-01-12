package com.example.oop;

public class User {
	private String password;
	
	public void initPassword() {
		RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();
		
		String randomPass = randomPasswordGenerator.generatePassword();
		
		/*
		 비밀번호는 최소 8자 이상 12자 이하여야 한다.
		 */
		if(randomPass.length() >= 8 && randomPass.length() <= 12) {
			this.password = randomPass;
		}
	}
}
