package com.example.demo.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//EntityをつけるとDBのテーブルと紐づく
public class Moneydata {
	@Id //テーブルの主キー
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Date date;
	private String breakdownName;
	private Integer inMoney;
	private Integer outMoney;

	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public Date getDate(){
		return date;
	}
	public void setDate(Date date){
		this.date = date;
	}
	public String getBreakdownName(){
		return breakdownName;
	}
	public void setBreakdownName(String breakdownName) {
		this.breakdownName = breakdownName;
	}
	public Integer getInMoney(){
		return inMoney;
	}
	public void setInMoney(Integer inMoney) {
		this.inMoney = inMoney;
	}
	public Integer getOutMoney(){
		return outMoney;
	}
	public void setOutMoney(Integer outMoney) {
		this.outMoney = outMoney;
	}

	@Override
	public String toString() {
		return "Moneydata [id=" + id + ", date=" + date
				+ ", breakdownName=" + breakdownName + ", inMoney=" + inMoney + ", outMoney=" + outMoney + "]";
	}
}
