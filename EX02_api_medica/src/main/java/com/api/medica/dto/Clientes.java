package com.api.medica.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")
public class Clientes {
	
	@Id
	@Column(name = "dni")
	private String dni;
	
	@Column(name = "nomapels")
	private String nomapels;
	
	@Column(name = "email")
	private String email;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente")
	private List<Citas> citas;

	public Clientes() {
	}

	/**
	 * @param dni
	 * @param nomapels
	 * @param email
	 * @param citas
	 */
	public Clientes(String dni, String nomapels, String email, List<Citas> citas) {
		super();
		this.dni = dni;
		this.nomapels = nomapels;
		this.email = email;
		this.citas = citas;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @return the nomapels
	 */
	public String getNomapels() {
		return nomapels;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the citas
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Citas")
	public List<Citas> getCitas() {
		return citas;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @param nomapels the nomapels to set
	 */
	public void setNomapels(String nomapels) {
		this.nomapels = nomapels;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @param citas the citas to set
	 */
	public void setCitas(List<Citas> citas) {
		this.citas = citas;
	}

	@Override
	public String toString() {
		return "Clientes [dni=" + dni + ", nomapels=" + nomapels + ", email=" + email + ", citas=" + citas + "]";
	}

}
