package br.com.streams;

import java.util.List;

public class Pessoa {
	  private String nome;
	    private String sexo;

	    public Pessoa() {
	    }

	    public Pessoa(String nome, String sexo) {
	        this.nome = nome;
	        this.sexo = sexo;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getSexo() {
	        return sexo;
	    }

	    public void setSexo(String sexo) {
	        this.sexo = sexo;
	    }
	    
	    public List listaDePessoas(){
	        Pessoa pessoa1 = new Pessoa("Matheus Henrique", "M");
	        Pessoa pessoa2 = new Pessoa("Hernandez Roja", "M");
	        Pessoa pessoa3 = new Pessoa("Mario Fernandez", "M");
	        Pessoa pessoa4 = new Pessoa("Cinthia", "F");
	        Pessoa pessoa5 = new Pessoa("Marta", "F");
	        Pessoa pessoa6 = new Pessoa("Elisa", "F");
	        return List.of(pessoa1,pessoa2,pessoa3,pessoa4, pessoa5, pessoa6);
	    }

	    @Override
	    public String toString() {
	        return "Pessoa{" + "nome=" + nome + ", sexo=" + sexo + '}';
	    }
}
