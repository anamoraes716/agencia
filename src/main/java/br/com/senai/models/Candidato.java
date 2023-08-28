package br.com.senai.models;

import java.time.LocalDate;
import java.time.ArrayList;
import java.time.List;

import br.com.senai.enuns.Genero;

public class Candidato {
     String nomeCompleto;
     LocalDate dataNascimento;
     String cpf;
     String email;
     Genero genero;
     String naturalidade;
     String nacionalidade;
    Endereço endereço;
    public List<Escolaridade> escolaridades = new ArrayList();
}