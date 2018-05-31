package goalsapp;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Testing {

	public static void main(String[] args) {
		String password = "user123";
		System.out.println(new BCryptPasswordEncoder(11).encode(password));
	}

}
