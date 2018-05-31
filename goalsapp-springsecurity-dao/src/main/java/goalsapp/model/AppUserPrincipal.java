package goalsapp.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class AppUserPrincipal implements UserDetails {

	private final User user;
	
	public AppUserPrincipal(User user) {
		this.user = user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> roles = new ArrayList<>();
		for(Role role : user.getRoles()) {
			roles.add(new SimpleGrantedAuthority(role.getCode()));
		}
		return roles;
	}

	@Override
	public String getPassword() {
		return this.user.getPassword();
	}

	@Override
	public String getUsername() {
		return this.user.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		return this.user.isActive();
	}
	
	@Override
	public boolean isAccountNonLocked() {
		return this.user.isActive();
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return this.user.isActive();
	}

	@Override
	public boolean isEnabled() {
		return this.user.isActive();
	}

	public User getUser() {
		return user;
	}	
}
