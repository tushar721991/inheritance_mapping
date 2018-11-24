package com.softedge.inheritancemapping.model;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("card")
public class CardPayment extends Payment {

	private long cardNumber;
	private String cardType;
	private int expiryMonth;
	private int expiryYear;
	public CardPayment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CardPayment(long paymentId, LocalDate paymentDate, String paymentDetails, double paymentAmount,
			long cardNumber, String cardType, int expiryMonth, int expiryYear) {
		super(paymentId, paymentDate, paymentDetails, paymentAmount);
		this.cardNumber = cardNumber;
		this.cardType = cardType;
		this.expiryMonth = expiryMonth;
		this.expiryYear = expiryYear;
	}



	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public int getExpiryMonth() {
		return expiryMonth;
	}
	public void setExpiryMonth(int expiryMonth) {
		this.expiryMonth = expiryMonth;
	}
	public int getExpiryYear() {
		return expiryYear;
	}
	public void setExpiryYear(int expiryYear) {
		this.expiryYear = expiryYear;
	}
	@Override
	public String toString() {
		return super.toString() + "\nCardPayment [cardNumber=" + cardNumber + ", cardType=" + cardType + ", expiryMonth=" + expiryMonth
				+ ", expiryYear=" + expiryYear + "]";
	}
	

	
	
	
}
