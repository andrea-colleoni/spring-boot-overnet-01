package corso.spring.clienti.model;

public class JwtResponse {
	
	private String jwttoken;


	public JwtResponse(String jwttoken) {
		super();
		this.jwttoken = jwttoken;
	}

	/**
	 * @return the jwttoken
	 */
	public String getJwttoken() {
		return jwttoken;
	}

	/**
	 * @param jwttoken the jwttoken to set
	 */
	public void setJwttoken(String jwttoken) {
		this.jwttoken = jwttoken;
	}
	
	

}
