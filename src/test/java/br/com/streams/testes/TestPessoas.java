package br.com.streams.testes;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

import br.com.streams.Pessoa;

public class TestPessoas {
	@Test
	public void listaSomenteMulheres() {
		Pessoa pessoa = new Pessoa();
		List<Pessoa> lista = pessoa.listaDePessoas();

		List<Pessoa> mulheres = lista.stream().
				filter(p -> p.getSexo().
						equals("F")).collect(Collectors.toList());

		assertTrue(mulheres.stream().allMatch(p -> p.getSexo().equals("F")));
	}

}
