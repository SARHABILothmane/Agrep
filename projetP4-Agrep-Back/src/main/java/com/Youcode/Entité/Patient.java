package com.Youcode.Entité;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Patient {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id_Patient;
 private String f_name;
 private String l_name;
 private String cin;
 private String  tel;
 
  
	@OneToOne(mappedBy="patient",cascade = CascadeType.ALL,orphanRemoval = true)
	@JsonIgnore
	private  DossierM dossierM  ;
	
	@OneToMany(mappedBy="patient",cascade = CascadeType.ALL,orphanRemoval = true)
	@JsonIgnore
	private List <Rendez_vous> rdvs;

	public int getId_Patient() {
		return id_Patient;
	}

	public void setId_Patient(int id_Patient) {
		this.id_Patient = id_Patient;
	}

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public String getL_name() {
		return l_name;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public DossierM getDossierM() {
		return dossierM;
	}

	public void setDossierM(DossierM dossierM) {
		this.dossierM = dossierM;
	}

	public List<Rendez_vous> getRdvs() {
		return rdvs;
	}

	public void setRdvs(List<Rendez_vous> rdvs) {
		this.rdvs = rdvs;
	}




	public Patient(int id_Patient, String f_name, String l_name, String cin, String tel, DossierM dossierM,
			List<Rendez_vous> rdvs) {
		super();
		this.id_Patient = id_Patient;
		this.f_name = f_name;
		this.l_name = l_name;
		this.cin = cin;
		this.tel = tel;
		this.dossierM = dossierM;
		this.rdvs = rdvs;
	}

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Patient [id_Patient=" + id_Patient + ", f_name=" + f_name + ", l_name=" + l_name + ", cin=" + cin
				+ ", tel=" + tel + ", dossierM=" + dossierM + ", rdvs=" + rdvs + "]";
	}

	
}
