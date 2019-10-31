package com.hcl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Stock {

	@Id
	private int userid;
	 @Id
	 @GeneratedValue
	private int stockid;
	 @Column
	private String sname;
	 @Column
	private int qty;
	 @Column
	private long price;
	 @Column
	private float brokerage;
	 
	 
	public int getStockid() {
		return stockid;
	}
	public void setStockid(int stockid) {
		this.stockid = stockid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public float getBrokerage() {
		return brokerage;
	}
	public void setBrokerage(float brokerage) {
		this.brokerage = brokerage;
	}
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	
	@Override
	public String toString() {
		return "Stock [userid=" + userid + ", stockid=" + stockid + ", sname=" + sname + ", qty=" + qty + ", price="
				+ price + ", brokerage=" + brokerage + "]";
	}
	
	public Stock(int userid, int stockid, String sname, int qty, long price, float brokerage) {
		super();
		this.userid = userid;
		this.stockid = stockid;
		this.sname = sname;
		this.qty = qty;
		this.price = price;
		this.brokerage = brokerage;
	}
	
	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
