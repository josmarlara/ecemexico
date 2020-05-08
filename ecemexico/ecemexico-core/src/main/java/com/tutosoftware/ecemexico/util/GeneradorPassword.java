package com.tutosoftware.ecemexico.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GeneradorPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password = "adminmexico";
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println(passwordEncoder.encode(password));
	}

}
