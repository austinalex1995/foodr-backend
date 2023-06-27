package com.backend.revpaybackend.Model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Data
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@Table(name = "transactions")
public class AccTransaction {
	
	/**
	 * Member Variables
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long id;
	
	@Column
	private String accUsername;
	
	@Column
	private double transactionAmount;
	
	@Column
	private String transactionDescription;

}
