package skate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import skate.beans.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {
	
}