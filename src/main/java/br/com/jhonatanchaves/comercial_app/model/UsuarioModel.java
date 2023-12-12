package br.com.jhonatanchaves.comercial_app.model;

import java.io.Serializable;

public class UsuarioModel extends Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private int matricula;
	private String cargo;
	private String salario;

	public UsuarioModel(String nome, String cpf, String dataNascimento, String rg, String nomeMae, String nomePai,
			int matricula, String cargo, String salario) {

		setNome(nome);
		setCpf(cpf);
		setDataNascimento(dataNascimento);
		super.rg = rg;
		super.nomeMae = nomeMae;
		super.nomePai = nomePai;
		this.matricula = matricula;
		this.cargo = cargo;
		this.salario = salario;

	}

	public void dadosCompletos() {
		System.out.println("Olá! " + getNome() + ", tudo bom!");
		System.out.println("Aqui estão seus dados: ");
		System.out.println("CPF:  " + getCpf());
		System.out.println("matricula: " + this.matricula);
		System.out.println("RG: " + getRg());
		System.out.println("Data Nascimento: " + getDataNascimento());
		System.out.println("Nome da mãe: " + getNomeMae());
		System.out.println("Nome Pai: " + getNomePai());

	}

	public void dados() {
		System.out.println("Olá " + super.nome + " tudo bom!");
		System.out.println("Aqui estão seus dados: ");
		System.out.println("CPF:  " + super.cpf);
		System.out.println("matricula: " + this.matricula);
		System.out.println("Cargo: " + this.cargo);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

}
