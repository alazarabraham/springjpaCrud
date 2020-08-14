package net.codejava.agent;

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
@Service
@Transactional
public class PolicyService {
    @Autowired PolicyRepository repo;
     
    public void save(Policy policy) {
        repo.save(policy);
    }
     
    public List<Policy> listAll() {
        return (List<Policy>) repo.findAll();
    }
     
    public Policy get(Long policy_key) {
        return repo.findById(policy_key).get();
    }
     
    public void delete(Long policy_key) {
        repo.deleteById(policy_key);
    }
     
}


