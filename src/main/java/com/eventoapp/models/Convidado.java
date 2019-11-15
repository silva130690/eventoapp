package com.eventoapp.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import org.hibernate.validator.constraints.NotEmpty;

/****
 * @param - Class que trata dos atributos do convidados 
 * @author Alex Silva
 * {@link} alexdomingos13@icloud.com
 */


@Entity
public class Convidado {
	
	@Id
	@NotEmpty
	private String rg;
	
	private String codigo;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	@NotEmpty
	private String nomeConvidado;
	
	@ManyToOne
	private Evento evento;

	public Evento getEvento() {
		return evento;
	}
	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getNomeConvidado() {
		return nomeConvidado;
	}
	public void setNomeConvidado(String nomeConvidado) {
		this.nomeConvidado = nomeConvidado;
	}

}
