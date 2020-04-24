package br.usjt.previsao;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Previsao implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	
	private Double tempmin;

	private Double tempmax;
	
	private int humidadear;
	
	private String descr;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getTempmin() {
		return tempmin;
	}

	public void setTempmin(Double tempmin) {
		this.tempmin = tempmin;
	}

	public Double getTempmax() {
		return tempmax;
	}

	public void setTempmax(Double tempmax) {
		this.tempmax = tempmax;
	}

	public int getHumidadear() {
		return humidadear;
	}

	public void setHumidadear(int humidadear) {
		this.humidadear = humidadear;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

}
