/**
 * 
 */
package com.example.oop;

/**
 * @author userK301
 *
 */
public class PasswordValidator {

	public static void validate(String password) {
		int length = password.length();
		if(length < 8 || length > 12) {
			throw new IllegalArgumentException("비번은 8자 이상, 12자 이하여야 한다.");
		}
	}

}
