package net.codejava.agent;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
 
@Entity
public class PolicyHolder {
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long PH_key;
	 
    private String firstname;
    private String middleinitial;
    private String lastname;
    private String dateOfBirth;
    private String password;
    private String emailaddress;
    private String policy_key;
 
    
   
    protected PolicyHolder() {
    }
 
    protected PolicyHolder(String firstname, String middleinitial, String lastname,String dateOfBirth, String password, String emailaddress,String policy_key) {
        this.firstname = firstname;
        this.middleinitial = middleinitial;
        this.lastname = lastname;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.emailaddress = emailaddress;
        this.policy_key = policy_key;
    }

	public Long getPH_key() {
		return PH_key;
	}

	public void setPH_key(Long pH_key) {
		PH_key = pH_key;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddleinitial() {
		return middleinitial;
	}

	public void setMiddleinitial(String middleinitial) {
		this.middleinitial = middleinitial;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailaddress() {
		return emailaddress;
	}

	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}

	public String getPolicy_key() {
		return policy_key;
	}

	public void setPolicy_key(String policy_key) {
		this.policy_key = policy_key;
	}





    
}
