public class LoginFormBean extends BaseBean {
	private String username;
	private String password;
	
	// Set by interceptor
	private String token;
	
	public String getUsername() { return this.username; }
	public String getPassword() { return this.password; }
	public String getToken() { return this.token; }
	
	public void setUsername(String username) { this.username = username; }
	public void setPassword(String password) { this.password = password; }
	public void setToken(String token) { this.token = token; }
}