package br.com.streams;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Principal {

	public static void main(String[] args) {
		listadepessoas();
        lerListaSomenteMulher();
        listaPessoasSeparadosPorVirgulasLambda();
        listaSeparadosPorVirgulaPorGrupoGenero();

	}
	
	static void listadepessoas() {
        System.out.println("\n" + "****lista Completa de pessoas******" + "\n");
        List<Pessoa> lista = new Pessoa().listaDePessoas();
        lista.stream().forEach(pessoa -> System.out.println(pessoa));
    }

    static void lerListaSomenteMulher() {
        System.out.println("\n" + "***Somente lista de Mulheres*****" + "\n");
        List<Pessoa> lista = new Pessoa().listaDePessoas();
        lista.stream()
                .filter(p -> p.getSexo().equals("F"))
                .forEach(pessoa -> System.out.println(pessoa));
    }

        
    static void listaPessoasSeparadosPorVirgulasLambda(){
         System.out.println("\n" + "****** Lista de Pessoas Separado por virgula usando expresão Lambda*****" + "\n");
         List<Pessoa> lista = new Pessoa().listaDePessoas();
          String nomePessoaSexo = ",";
          String[] nomes = nomePessoaSexo.split(" ; ");
          lista.stream().forEach(pp->System.out.println(pp + nomes[0]));             
    }
    
    private static void imprimirGrupo(Map<String, List<Pessoa>> gruposPorGenero, String genero) {
    List<Pessoa> pessoasDoGenero = gruposPorGenero.getOrDefault(genero, Collections.emptyList());

    if (!pessoasDoGenero.isEmpty()) {
        String resultado = pessoasDoGenero.stream()
                .map(Pessoa::toString)
                .collect(Collectors.joining(", "));
        System.out.println(resultado);
    } else {
        System.out.println("Nenhum registro para o grupo " + genero);
    }
}
    
    static void listaSeparadosPorVirgulaPorGrupoGenero(){
        System.out.println("\n" + "****** Lista de Pessoas Separado por Genero*****" + "\n");
        List<Pessoa> lista = new Pessoa().listaDePessoas();

        Map<String, List<Pessoa>> gruposPorGenero = lista.stream()
                .collect(Collectors.groupingBy(Pessoa::getSexo));

        System.out.println("******************* Grupo Masculino ********************");
        imprimirGrupo(gruposPorGenero, "M");

        System.out.println("******************* Grupo Feminino ********************");
        imprimirGrupo(gruposPorGenero, "F");
    }

}
