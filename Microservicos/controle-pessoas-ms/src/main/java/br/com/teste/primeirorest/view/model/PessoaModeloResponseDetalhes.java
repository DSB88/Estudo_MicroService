package br.com.teste.primeirorest.view.model;

import java.util.List;

import br.com.teste.primeirorest.compartilhado.AnimalDto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PessoaModeloResponseDetalhes extends PessoaModeloRequest {
    private List<AnimalDto> animais;
     
}
