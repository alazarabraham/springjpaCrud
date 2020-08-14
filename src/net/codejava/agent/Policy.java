package net.codejava.agent;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
 
@Entity
public class Policy {
    private String type;
    private String time_period;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long policy_key;
 
    protected Policy() {
    }
 
    protected Policy(String type, String time_period) {
        this.type = type;
        this.time_period = time_period;
    }

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTime_period() {
		return time_period;
	}

	public void setTime_period(String time_period) {
		this.time_period = time_period;
	}

	public Long getPolicy_key() {
		return policy_key;
	}

	public void setPolicy_key(Long policy_key) {
		this.policy_key = policy_key;
	}



    
}
