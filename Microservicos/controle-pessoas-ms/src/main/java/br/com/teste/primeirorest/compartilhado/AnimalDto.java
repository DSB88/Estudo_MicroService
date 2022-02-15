package br.com.teste.primeirorest.compartilhado;

import lombok.Data;

@Data
public class AnimalDto {
    
    private Long id;
    private Long dono;
    private String nome;
    private Integer idade;
    private String raca;
    private Boolean vivo;
}
