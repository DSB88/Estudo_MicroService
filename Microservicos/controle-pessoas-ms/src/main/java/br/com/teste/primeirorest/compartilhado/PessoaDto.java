package br.com.teste.primeirorest.compartilhado;

import java.util.List;

import lombok.Data;

@Data
public class PessoaDto {
    private Long id;
    private String nome;
    private String sobrenome;
    private List<AnimalDto> animais;

}
