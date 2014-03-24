package com.patternbox.axon.domain.model.order;

import java.io.Serializable;
import java.util.Date;

/**
 * @author <a href='http://www.patternbox.com'>D. Ehms, Patternbox</a>
 */
public class OrderCreatedEvent implements Serializable {

	private static final long serialVersionUID = -2516626722123331356L;

	private final String contactId;

	private final Date orderDate;

	public OrderCreatedEvent(String contactId, Date orderDate) {
		this.contactId = contactId;
		this.orderDate = orderDate;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public String getContactId() {
		return contactId;
	}
}
