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
@Table(name = "timeslots") 
public class Timeslot {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")  
    private Long id; 
	@Column(name = "date")  
	private String date;
	@Column(name = "slota") 
	private int slota;
	@Column(name = "slotb") 
	private int slotb;
	@Column(name = "slotc") 
	private int slotc;
	@Column(name = "slotd") 
	private int slotd;
	@Column(name = "slote") 
	private int slote;
	@Column(name = "slotf") 
	private int slotf;
	@Column(name = "slotg") 
	private int slotg;
	@Column(name = "sloth") 
	private int sloth;
	@Column(name = "sloti") 
	private int sloti;
	@Column(name = "slotj") 
	private int slotj;
	@Column(name = "slotk") 
	private int slotk;
	@Column(name = "slotl") 
	private int slotl;
	@Column(name = "slotm") 
	private int slotm;
	@Column(name = "slotn") 
	private int slotn;
	@Column(name = "sloto") 
	private int sloto;
	@Column(name = "slotp") 
	private int slotp;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getSlota() {
		return slota;
	}
	public void setSlota(int slota) {
		this.slota = slota;
	}
	public int getSlotb() {
		return slotb;
	}
	public void setSlotb(int slotb) {
		this.slotb = slotb;
	}
	public int getSlotc() {
		return slotc;
	}
	public void setSlotc(int slotc) {
		this.slotc = slotc;
	}
	public int getSlotd() {
		return slotd;
	}
	public void setSlotd(int slotd) {
		this.slotd = slotd;
	}
	public int getSlote() {
		return slote;
	}
	public void setSlote(int slote) {
		this.slote = slote;
	}
	public int getSlotf() {
		return slotf;
	}
	public void setSlotf(int slotf) {
		this.slotf = slotf;
	}
	public int getSlotg() {
		return slotg;
	}
	public void setSlotg(int slotg) {
		this.slotg = slotg;
	}
	public int getSloth() {
		return sloth;
	}
	public void setSloth(int sloth) {
		this.sloth = sloth;
	}
	public int getSloti() {
		return sloti;
	}
	public void setSloti(int sloti) {
		this.sloti = sloti;
	}
	public int getSlotj() {
		return slotj;
	}
	public void setSlotj(int slotj) {
		this.slotj = slotj;
	}
	public int getSlotk() {
		return slotk;
	}
	public void setSlotk(int slotk) {
		this.slotk = slotk;
	}
	public int getSlotl() {
		return slotl;
	}
	public void setSlotl(int slotl) {
		this.slotl = slotl;
	}
	public int getSlotm() {
		return slotm;
	}
	public void setSlotm(int slotm) {
		this.slotm = slotm;
	}
	public int getSlotn() {
		return slotn;
	}
	public void setSlotn(int slotn) {
		this.slotn = slotn;
	}
	public int getSloto() {
		return sloto;
	}
	public void setSloto(int sloto) {
		this.sloto = sloto;
	}
	public int getSlotp() {
		return slotp;
	}
	public void setSlotp(int slotp) {
		this.slotp = slotp;
	}
	
}
