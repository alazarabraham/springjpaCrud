package net.codejava.agent;


import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
@Service
@Transactional
public class PolicyHolderService {
    @Autowired PolicyHolderRepository repo;
     
    public void save(PolicyHolder policyHolder) {
        repo.save(policyHolder);
    }
     
    public List<PolicyHolder> listAll() {
        return (List<PolicyHolder>) repo.findAll();
    }
     
    public PolicyHolder get(Long PH_key) {
        return repo.findById(PH_key).get();
    }
     
    public void delete(Long PH_key) {
        repo.deleteById(PH_key);
    }
     
}
