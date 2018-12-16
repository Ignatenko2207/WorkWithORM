package info.sjd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private Integer userId;
	
	@Column(name = "login", length = 100)
	private String login;
	
	@Column(name = "password", length = 100)
	private String password;
	
	@Column(name = "first_name")
	private String firstName;

	@Column(name = "second_name")
	private String secondName;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	
	public User() {
	}
	
	public User(Integer userId, String login, String password, String firstName, String secondName) {
		super();
		this.userId = userId;
		this.login = login;
		this.password = password;
		this.firstName = firstName;
		this.secondName = secondName;
	}
	
}
