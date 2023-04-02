package com.restfulwebservices.security.jwt;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtInMemoryUserDetailsService implements UserDetailsService {

	static List<JwtUserDetails> inMemoryUserList = new ArrayList<>();

	static {
		inMemoryUserList.add(new JwtUserDetails(1L, "pushkar",
				"$2a$10$bgwfdhtPwPu7/Dd/3e73U.0S.SLh/qM2ySrJCMg1Hodr2Zp6NOXtC", "ROLE_USER_2"));
		inMemoryUserList.add(new JwtUserDetails(2L, "in28minutes",
				"$2a$10$b8nRg8eixPBAUa0jBdjlN.lLLn5CRNXUeyJYUwn5QYfss4Oqj.E0y", "ROLE_USER_2"));
		inMemoryUserList.add(new JwtUserDetails(3L, "ranga",
				"$2a$10$0M/zMaDAmgoBsh1hDJRPp.6Mqped.LzjHHQpeBPbuv9ps29YqIXhe", "ROLE_USER_2"));
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<JwtUserDetails> findFirst = inMemoryUserList.stream()
				.filter(user -> user.getUsername().equals(username)).findFirst();

		if (!findFirst.isPresent()) {
			throw new UsernameNotFoundException(String.format("USER_NOT_FOUND '%s'.", username));
		}

		return findFirst.get();
	}

}
