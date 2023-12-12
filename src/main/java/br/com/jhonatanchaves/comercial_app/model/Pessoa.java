package br.com.jhonatanchaves.comercial_app.model;

import java.util.Objects;
import java.util.Optional;

public class Pessoa {

	protected Long id;
	protected String nome;
	protected String dataNascimento;
	protected String cpf;
	protected String rg;
	protected String nomeMae;
	protected String nomePai;

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

		if (nome == null || nome.trim().isEmpty()) {
			throw new IllegalArgumentException("Nome não pode ser nulo nem vazio");
		}

		this.nome = nome;
	}

	public String getDataNascimento() {

		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		if (dataNascimento == null || dataNascimento.trim().isEmpty()) {
			throw new IllegalArgumentException("data nasciemnto não pode ser nulo nem vazio");
		}
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {

		return cpf;
	}

	public void setCpf(String cpf) {

		if (cpf == null || cpf.trim().isEmpty()) {
			throw new IllegalArgumentException("CPF não pode ser nulo nem vazio");
		}

		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(id, other.id);
	}

}
