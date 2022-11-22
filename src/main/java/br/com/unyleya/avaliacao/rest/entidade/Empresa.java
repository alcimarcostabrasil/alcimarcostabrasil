package br.com.unyleya.avaliacao.rest.entidade;

import java.io.Serializable;
import java.util.Objects;

public class Empresa implements Serializable{

	private static final long serialVersionUID = 1L;
	private int id;
	private String nome;
	private String endereco;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		return Objects.equals(id, other.id);
	}
	@Override
	public String toString() {
		return "Empresa [id=" + id + ", nome=" + nome + ", endereco=" + endereco + "]";
	}
	
	
	
	

}
