package it.domenico.classi;

public class User {
	private String username;
	private String email;
	private String messaggio;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessaggio() {
		return messaggio;
	}
	public void setMessaggio(String messaggio) {
		this.messaggio = messaggio;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", email=" + email + ", messaggio=" + messaggio + "]";
	} 
	
}
