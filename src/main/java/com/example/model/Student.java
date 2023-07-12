package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name = "students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int roll;
	private String name;
	private String father_name;
	private long mobile_no;
	private long fa_mobile;
	private int fees;
	private String address;
	private String percentage;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFather_name() {
		return father_name;
	}
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	public long getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}
	public long getFa_mobile() {
		return fa_mobile;
	}
	public void setFa_mobile(long fa_mobile) {
		this.fa_mobile = fa_mobile;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPercentage() {
		return percentage;
	}
	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, int roll, String name, String father_name, long mobile_no, long fa_mobile, int fees,
			String address, String percentage) {
		super();
		this.id = id;
		this.roll = roll;
		this.name = name;
		this.father_name = father_name;
		this.mobile_no = mobile_no;
		this.fa_mobile = fa_mobile;
		this.fees = fees;
		this.address = address;
		this.percentage = percentage;
	}
	

	

}

