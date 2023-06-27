package com.backend.revpaybackend.Service;

import java.util.List;

import com.backend.revpaybackend.Model.Card;
import com.backend.revpaybackend.Repository.CardRepo;
public class CardService {
	
	/**
	 * Member Variables
	 */
	
	private CardRepo cardRepo;
	
	
	
	/**
	 * Constructor
	 */
	
	public CardService(CardRepo repo) {
		
		this.cardRepo = repo;
		
	}
	
	
	
	/**
	 * Class Methods
	 */
	
	public List<Card> findAllByAccountUsername(String username) {
		
		return this.cardRepo.findAllByAccountUsername(username);
		
	}
	
	public Card attemptToRegisterCard(Card newCard) {
		
		if (this.cardRepo.findByCardNumber(newCard.getCardNumber()) != null) {
			
			return null;
			
		}
		
		return this.cardRepo.save(newCard);
		
	}

}
