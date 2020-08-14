package net.codejava.agent;
 
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
 
 
 
@Controller
public class AgentController {
 
    @Autowired
    private AgentService agentService;
    @Autowired
    private PolicyService policyService;
    @Autowired
    private PolicyHolderService policyHolderService;
	@RequestMapping("/")
	public ModelAndView home() {
    List<Agent> listAgent = agentService.listAll();
    ModelAndView mav = new ModelAndView("index");
    mav.addObject("listAgent", listAgent);
    return mav;
}
	@RequestMapping("/new")
	public String newCustomerForm(Map<String, Object> model) {
	    Agent agent = new Agent();
	    model.put("agent", agent);
	    return "new_agent";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveAgent(@ModelAttribute("agent") Agent agent) {
    agentService.save(agent);
    return "redirect:/";
	}
    
    @RequestMapping("/edit")
    public ModelAndView editAgentForm(@RequestParam long agent_id) {
        ModelAndView mav = new ModelAndView("edit_agent");
        Agent agent = agentService.get(agent_id);
        mav.addObject("agent", agent);
     
        return mav;
    }

	@RequestMapping("/delete")
	public String deleteAgentForm(@RequestParam long agent_id) {
    agentService.delete(agent_id);
    return "redirect:/";       
}

	@RequestMapping("/policyindex")
	public ModelAndView policy() {
    List<Policy> listPolicy = policyService.listAll();
    ModelAndView mavpolicy = new ModelAndView("policyindex");
    mavpolicy.addObject("listPolicy", listPolicy);
    return mavpolicy;
}
	@RequestMapping("/newpolicy")
	public String newPolicyCustomerForm(Map<String, Object> model) {
	    Policy policy = new Policy();
	    model.put("policy", policy);
	    return "new_policy";
	}
	
	@RequestMapping(value = "/savepolicy", method = RequestMethod.POST)
	public String savePolicy(@ModelAttribute("policy") Policy policy) {
    policyService.save(policy);
    return "redirect:/policyindex";
	}
    
    @RequestMapping("/editpolicy")
    public ModelAndView editPolicyForm(@RequestParam long policy_key) {
        ModelAndView mav = new ModelAndView("edit_policy");
        Policy policy = policyService.get(policy_key);
        mav.addObject("policy", policy);
     
        return mav;
    }

	@RequestMapping("/deletepolicy")
	public String deletePolicyForm(@RequestParam long policy_key) {
    policyService.delete(policy_key);
    return "redirect:/policyindex";       
}


	@RequestMapping("/policyholderindex")
	public ModelAndView policyHolder() {
    List<PolicyHolder> listPolicyHolder = policyHolderService.listAll();
    ModelAndView mavpolicy = new ModelAndView("policyHolderindex");
    mavpolicy.addObject("listPolicyHolder", listPolicyHolder);
    return mavpolicy;
}
	@RequestMapping("/newpolicyholder")
	public String newPolicyHolderCustomerForm(Map<String, Object> model) {
	    PolicyHolder policyHolder = new PolicyHolder();
	    model.put("policyHolder", policyHolder);
	    return "new_policyHolder";
	}
	
	@RequestMapping(value = "/savepolicyholder", method = RequestMethod.POST)
	public String savePolicyHolder(@ModelAttribute("policyHolder") PolicyHolder policyHolder) {
    policyHolderService.save(policyHolder);
    return "redirect:/policyholderindex";
	}
    
    @RequestMapping("/editpolicyholder")
    public ModelAndView editPolicyHolderForm(@RequestParam long PH_key) {
        ModelAndView mav = new ModelAndView("edit_policyHolder");
        PolicyHolder policyHolder = policyHolderService.get(PH_key);
        mav.addObject("policyHolder", policyHolder);
     
        return mav;
    }

	@RequestMapping("/deletepolicyholder")
	public String deletePolicyHolderForm(@RequestParam long PH_key) {
    policyService.delete(PH_key);
    return "redirect:/policyholderindex";       
}





}

