package com.example.BankingAppPostgres;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	@Id  
    @GeneratedValue(strategy=GenerationType.IDENTITY)  
    private int s_id;  
    
    //s_id is primary key and it is type of serial
    private String s_name;

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}  
      

}
