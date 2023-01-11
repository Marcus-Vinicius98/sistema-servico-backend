package com.api.backend.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "db_servico")
public class Servico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nomeCliente;

	@Temporal(TemporalType.DATE)
	private Date dataInicio = new Date();

	@Temporal(TemporalType.DATE)
	private Date dataTermino;

	private String descServico;

	private Double valorServico;

	private double valorPago;

	@Temporal(TemporalType.DATE)
	private Date dataPagameento;

	private String status;

	public Servico() {

	}

	public Servico(Long id, String nomeCliente, Date dataInicio, Date dataTermino, String descServico,
			Double valorServico, double valorPago, Date dataPagameento, String status) {
		super();
		this.id = id;
		this.nomeCliente = nomeCliente;
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.descServico = descServico;
		this.valorServico = valorServico;
		this.valorPago = valorPago;
		this.dataPagameento = dataPagameento;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(Date dataTermino) {
		this.dataTermino = dataTermino;
	}

	public String getDescServico() {
		return descServico;
	}

	public void setDescServico(String descServico) {
		this.descServico = descServico;
	}

	public Double getValorServico() {
		return valorServico;
	}

	public void setValorServico(Double valorServico) {
		this.valorServico = valorServico;
	}

	public double getValorPago() {
		return valorPago;
	}

	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}

	public Date getDataPagameento() {
		return dataPagameento;
	}

	public void setDataPagameento(Date dataPagameento) {
		this.dataPagameento = dataPagameento;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
