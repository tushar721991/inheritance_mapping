package com.softedge.inheritancemapping.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Payment {

	@Id
	private long paymentId;
	private LocalDate paymentDate;
	private String paymentDetails;
	private double paymentAmount;
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payment(long paymentId, LocalDate paymentDate, String paymentDetails, double paymentAmount) {
		super();
		this.paymentId = paymentId;
		this.paymentDate = paymentDate;
		this.paymentDetails = paymentDetails;
		this.paymentAmount = paymentAmount;
	}
	public long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}
	public LocalDate getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}
	public String getPaymentDetails() {
		return paymentDetails;
	}
	public void setPaymentDetails(String paymentDetails) {
		this.paymentDetails = paymentDetails;
	}
	public double getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", paymentDate=" + paymentDate + ", paymentDetails=" + paymentDetails
				+ ", paymentAmount=" + paymentAmount + "]";
	}
	
	
	
}
