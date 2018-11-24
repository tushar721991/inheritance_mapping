package com.softedge.inheritancemapping.model;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue(value="cheque")
public class ChequePayment extends Payment {

	private long chequeNumber;
	private String chequeType;
	public ChequePayment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChequePayment(long paymentId, LocalDate paymentDate
			, String paymentDetails, double paymentAmount, long chequeNumber, String chequeType) {
		super(paymentId, paymentDate, paymentDetails, paymentAmount);
		// TODO Auto-generated constructor stub
		this.chequeNumber = chequeNumber;
		this.chequeType = chequeType;
	}
	public long getChequeNumber() {
		return chequeNumber;
	}
	public void setChequeNumber(long chequeNumber) {
		this.chequeNumber = chequeNumber;
	}
	public String getChequeType() {
		return chequeType;
	}
	public void setChequeType(String chequeType) {
		this.chequeType = chequeType;
	}
	
	
	@Override
	public String toString() {
		return super.toString()+"\nChequePayment [chequeNumber=" + chequeNumber + ", chequeType=" + chequeType + "]";
	}
	
	
	
	
}
