package com.palt.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service 
public class JwtUserDetailsServiceImpl implements UserDetailsService { 
	// 查询用户使用

	
	@Override 
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException { 
	
		return null;
	}
}

