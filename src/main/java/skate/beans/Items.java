package skate.beans;

import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Items {
	@Id
	@GeneratedValue
	private long itemId;
	private String itemName;
	private String itemDescription;
	private Double itemPrice;
	private String itemLocation;
	private int itemQuantity;
	
	public Items(long itemId, String itemName, int itemQuantity, Double itemPrice ) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemQuantity = itemQuantity;
		this.itemPrice = itemPrice;
	}
}
