package net.codejava.agent;


import java.util.List;
 
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
 
public interface PolicyHolderRepository extends CrudRepository<PolicyHolder, Long> {
     
}
