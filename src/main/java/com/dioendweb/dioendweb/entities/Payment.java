package com.dioendweb.dioendweb.entities;

import java.time.Instant;

public class Payment {
	
	private Long id;
	private Instant moment;
	
	@OneToOne
	@MapsId
	private Order order;

}
