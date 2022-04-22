//Address to be input and joined with Customer

package skate.beans;

import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
	@Id
	@GeneratedValue
	private long customerId;
	private String street;
	private String city;
	private String state;
	private int zip;
}
