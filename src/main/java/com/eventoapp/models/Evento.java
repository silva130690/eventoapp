package com.eventoapp.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotEmpty;

//Sera minha entidade no banco de dados(table)



/****
 * Class que sera minha entidade(tabela) no banco de dados 
 * @author Alex Silva
 * @version 0.0.1
 * @Entity Nao permite que os campos esteja em branco
 * @OneToMany Relacionamento de um para muitos
 */


@Entity
public class Evento implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long codigo;

	
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@NotEmpty
	private String nome;
	
	@NotEmpty
	private String local;
	
	@NotEmpty
	private String data;
	
	@OneToMany
	private List<Convidado> convidado;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	private String horario;


	

}
