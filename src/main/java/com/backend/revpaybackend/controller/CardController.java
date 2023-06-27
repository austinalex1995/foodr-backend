package com.backend.revpaybackend.Controller;

import java.util.List;

import com.backend.revpaybackend.Model.Card;
import com.backend.revpaybackend.Service.CardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import jakarta.websocket.server.PathParam;

public class CardController {
	
	/**
	 * Member Variables
	 */
	
	private CardService cardService;
	
	
	
	/**
	 * Constructor
	 */
	
	public CardController(CardService service) {
		
		this.cardService = service;
		
	}
	
	
	
	/**
	 * Class Methods
	 */
	
	@GetMapping("card/{username}")
	public List<Card> getCardsByUsername(@PathParam(value = "username") String username) {
		
		return this.cardService.findAllByAccountUsername(username);
		
	}
	
	@PostMapping("card/register")
	public Card attemptToRegisterCard(@RequestBody Card newCard) {
		
		return this.cardService.attemptToRegisterCard(newCard);
		
	}

}
