package br.com.senai;

import br.com.senai.enuns.Estado;
import br.com.senai.enuns.Genero;

import java.time.LocalDate;
import java.util.Arrays;

import br.com.senai.enuns.Candidato;
import br.com.senai.enuns.Endereco;

public class App 
{
    public static void main( String[] args )
    {
       
        Endereco endereco = new Endereco();
        endereco.cep = "64000000";
        endereco.logradouro = "Rua Porto, 3555";
        endereco.cidade = "Teresina";
        endereco.estado = Estado.PI;

        br.com.senai.models.Candidato yasmin = new Candidato();
        yasmin.nomeCompleto = "Yasmin Carvalho da Silva";
        yasmin.dataNascimento = LocalDate.of(2000, 10, 16);
        yasmin.email = "yasmincarvalho@gmail.com";
        yasmin.genero = Genero.F;
        yasmin.naturalidade = Estado.PI.toString();
        yasmin.nacionalidade = "Brasil";
        yasmin.endereco = endereco;

        Escolaridade e1 = new Escolaridade();
        e1.nomeCurso = "Sistema pela internet";
        e1.nomeInstituicao = "Senai";
        e1.dataInicio = LocalDate.of(2020, 10, 1);
        e1.dataFim = LocalDate.of(2023, 06, 10);

        Escolaridade e2 = new Escolaridade();
        e2.nomeCurso = "Engenharia Civil";
        e2.nomeInstituicao = "IFPI - Inst. Federal do Píaui";
        e2.dataInicio = LocalDate.of(2020, 02, 1);
        e2.dataFim = LocalDate.of(2023, 06, 10);

        yaasmin.escolaridades = Arrays.asList(e1,e2);

        System.out.println("Nome Completo "+yasmin.nomeCompleto);
        System.out.println("Idade: "+ Period.between(yasmin.dataNascimento, LocalDate.now()).get)
        System.out.println("Endereço:" + yasmin.endereço.logradouro);

        for (Escolaridade escolaridade : yasmin.escolaridades){
           System.setOut(escolaridade.nomeCurso+ " - "+escolaridade.nomeInstituicao);
        }
    }
}
        
