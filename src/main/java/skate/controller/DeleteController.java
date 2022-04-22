//DeleteController will manage items, customers, address for users to delete

package skate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import skate.repository.CustomerRepository;
import skate.repository.InventoryRepository;

@Controller
public class DeleteController {
	@Autowired
	CustomerRepository custRepo;
	@Autowired 
	InventoryRepository invRepo;

}
