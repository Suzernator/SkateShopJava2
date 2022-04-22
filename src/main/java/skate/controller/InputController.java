//InputController will manage items, customers, address for users to input

package skate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import skate.beans.Customer;
import skate.beans.Items;
import skate.repository.CustomerRepository;
import skate.repository.InventoryRepository;

@Controller
public class InputController {
	@Autowired
	CustomerRepository custRepo;
	@Autowired 
	InventoryRepository invRepo;

	@GetMapping("/inputCustomer")
	public String addNewCustomer(Model model) {
		Customer c = new Customer();
		model.addAttribute("newCustomer", c);
		return "input";
	}
	
	@GetMapping("/inputItems")
	public String addNewItems(Model model) {
		Items i = new Items();
		model.addAttribute("newItems", i);
		return "input";
	}
}
