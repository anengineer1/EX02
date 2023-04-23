package com.api.medica.dto;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "citas")
public class Citas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "fecha")
	private LocalDateTime fecha;
	
	@ManyToOne
	@JoinColumn(name = "idcliente")
	private Clientes cliente;
	
	@ManyToOne
	@JoinColumn(name = "iddentista")
	private Dentistas dentista;

	public Citas() {
	}

	/**
	 * @param id
	 * @param descripcion
	 * @param fecha
	 * @param cliente
	 * @param dentista
	 */
	public Citas(long id, String descripcion, LocalDateTime fecha, Clientes cliente, Dentistas dentista) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.fecha = fecha;
		this.cliente = cliente;
		this.dentista = dentista;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the fecha
	 */
	public LocalDateTime getFecha() {
		return fecha;
	}

	/**
	 * @return the cliente
	 */
	public Clientes getCliente() {
		return cliente;
	}

	/**
	 * @return the dentista
	 */
	public Dentistas getDentista() {
		return dentista;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}

	/**
	 * @param dentista the dentista to set
	 */
	public void setDentista(Dentistas dentista) {
		this.dentista = dentista;
	}
	
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Citas [id=" + id + ", descripcion=" + descripcion + ", fecha=" + fecha + ", cliente=" + cliente
				+ ", dentista=" + dentista + "]";
	}

}
