package com.backend.revpaybackend.Repository;

import java.util.List;

import com.backend.revpaybackend.Model.Card;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CardRepo extends JpaRepository<Card, Integer> {
	
	List<Card> findAllByAccountUsername(String username);
	
	Card findByCardNumber(String cardNumber);

}
