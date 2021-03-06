package com.isi.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class User implements Serializable {
	
	@Id @GeneratedValue
	private Long iduser;
	
	private String nomuser;
	private String prenomuser;
	private String teluser;
	private String loginuser;
	private String passworduser;
	private String statutuser;
	
	
	@ManyToOne
	@JoinColumn(name="roleuser")
	private Role role;
	
	@ManyToOne
	@JoinColumn(name="numcompte")
	private Compte compte;
	
	@OneToMany(mappedBy="user",fetch=FetchType.LAZY)
	private Collection<Guichet> guichets;
	
	@OneToMany(mappedBy="user",fetch=FetchType.LAZY)
	private Collection<Transfert> transfert;

	public Collection<Transfert> getTransfert() {
		return transfert;
	}



	public void setTransfert(Collection<Transfert> transfert) {
		this.transfert = transfert;
	}



	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Collection<Guichet> getGuichets() {
		return guichets;
	}



	public void setGuichets(Collection<Guichet> guichets) {
		this.guichets = guichets;
	}



	public Compte getCompte() {
		return compte;
	}



	public void setCompte(Compte compte) {
		this.compte = compte;
	}



	public User(String nomuser, String prenomuser, String teluser, String loginuser, String passworduser,
			String statutuser, Role role, Compte compte) {
		super();
		this.nomuser = nomuser;
		this.prenomuser = prenomuser;
		this.teluser = teluser;
		this.loginuser = loginuser;
		this.passworduser = passworduser;
		this.statutuser = statutuser;
		this.role = role;
		this.compte = compte;
	}



	public Long getIduser() {
		return iduser;
	}

	public void setIduser(Long iduser) {
		this.iduser = iduser;
	}

	public String getNomuser() {
		return nomuser;
	}

	public void setNomuser(String nomuser) {
		this.nomuser = nomuser;
	}

	public String getPrenomuser() {
		return prenomuser;
	}

	public void setPrenomuser(String prenomuser) {
		this.prenomuser = prenomuser;
	}

	public String getTeluser() {
		return teluser;
	}

	public void setTeluser(String teluser) {
		this.teluser = teluser;
	}

	public String getLoginuser() {
		return loginuser;
	}

	public void setLoginuser(String loginuser) {
		this.loginuser = loginuser;
	}

	public String getPassworduser() {
		return passworduser;
	}

	public void setPassworduser(String passworduser) {
		this.passworduser = passworduser;
	}

	public String getStatutuser() {
		return statutuser;
	}

	public void setStatutuser(String statutuser) {
		this.statutuser = statutuser;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
	

}
