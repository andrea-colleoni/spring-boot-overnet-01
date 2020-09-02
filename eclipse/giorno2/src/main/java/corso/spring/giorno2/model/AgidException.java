package corso.spring.giorno2.model;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class AgidException extends ResponseStatusException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AgidException(HttpStatus status) {
		super(status);
	}
	
	public AgidException(HttpStatus status, String message) {
		super(status, message);
	}
	/*
	 {
    "type": "https://example.com/probs/out-of-credit",
    "title": "You do not have enough credit.",
    "detail": "Your current balance is 30, but that costs 50.",
    "instance": "/account/12345/msgs/abc",
    "balance": 30,
    "accounts": ["/account/12345",
                 "/account/67890"]
	}
	*/

	private String type;
	private String title;
	private String detail;
	private String instance;
	
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the detail
	 */
	public String getDetail() {
		return detail;
	}
	/**
	 * @param detail the detail to set
	 */
	public void setDetail(String detail) {
		this.detail = detail;
	}
	/**
	 * @return the instance
	 */
	public String getInstance() {
		return instance;
	}
	/**
	 * @param instance the instance to set
	 */
	public void setInstance(String instance) {
		this.instance = instance;
	}
	
	
}
