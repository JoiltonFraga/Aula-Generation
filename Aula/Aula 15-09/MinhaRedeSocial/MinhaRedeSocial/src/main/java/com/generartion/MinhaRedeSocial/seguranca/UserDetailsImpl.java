package com.generartion.MinhaRedeSocial.seguranca;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.generartion.MinhaRedeSocial.model.Usuario;

public class UserDetailsImpl implements UserDetails{

    private static final long serialVersionUID =1L; // classse para controle interno
	
	private String userName;
	
	private String password;
	
	public UserDetailsImpl (Usuario user) { //contrutor de classe, recebendo como parametro o user 
		this.userName = user.getUsuario(); // e vai popular esse user com login e senha.
		this.password = user.getSenha();
	}
	
	public  UserDetailsImpl() {}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() { //trocar null por password
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() { // trocar null por userName
		// TODO Auto-generated method stub
		return userName;
	}

	@Override
	public boolean isAccountNonExpired() { // trocar null false por true em todos os metodos
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
