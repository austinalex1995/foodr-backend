package com.backend.revpaybackend.Repository;

import java.util.List;

import com.backend.revpaybackend.Model.AccTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
public interface TransactionRepo extends JpaRepository<AccTransaction, Integer> {
	
	List<AccTransaction> findAllByAccUsername(String username);

}
