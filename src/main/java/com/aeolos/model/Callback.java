package com.aeolos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"id"})	
@Entity  
@Table(name = "callbacks") 
public class Callback {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")  
    private Long id;  
    @Column(name = "employeenumber")  
    private String employeenumber;  
    @Column(name = "customer")  
    private String customer; 
    @Column(name = "mobile")  
    private String mobile; 
    @Column(name = "landline")  
    private String landline; 
    @Column(name = "cbtype")  
    private String cbtype; 
    @Column(name = "cbreason")  
    private String cbreason;
	@Column(name = "notes")  
    private String notes;
	@Column(name = "cbdate")  
    private String cbdate;
	@Column(name = "cbtime")  
    private String cbtime;
	@Column(name = "logdate")  
    private String logdate;
	@Column(name = "status")
	private String status;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCbdate() {
		return cbdate;
	}
	public String getCbreason() {
		return cbreason;
	}
	public String getCbtime() {
		return cbtime;
	}
	public String getCbtype() {
		return cbtype;
	}
	public String getCustomer() {
		return customer;
	}
	public String getEmployeenumber() {
		return employeenumber;
	}
	public Long getId() {
		return id;
	}
	public String getLandline() {
		return landline;
	}
	public String getLogdate() {
		return logdate;
	}
	public String getMobile() {
		return mobile;
	}
	public String getNotes() {
		return notes;
	}
	public void setCbdate(String cbdate) {
		this.cbdate = cbdate;
	}
	public void setCbreason(String cbreason) {
		this.cbreason = cbreason;
	}
	public void setCbtime(String cbtime) {
		this.cbtime = cbtime;
	}
	public void setCbtype(String cbtype) {
		this.cbtype = cbtype;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public void setEmployeenumber(String employeenumber) {
		this.employeenumber = employeenumber;
	}
	public void setId(Long id) {
		this.id = id;
	} 
    public void setLandline(String landline) {
		this.landline = landline;
	}
    public void setLogdate(String logdate) {
		this.logdate = logdate;
	} 
    public void setMobile(String mobile) {
		this.mobile = mobile;
	} 
    public void setNotes(String notes) {
		this.notes = notes;
	} 
}
