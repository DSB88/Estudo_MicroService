package br.com.teste.animaisms.view.model;

import lombok.Data;

@Data
public class AnimalModeloResponse {
    private Long id;
    private String dono;
    private String nome;
    private Integer idade;
    private String raca;
    private Boolean vivo;
   
}
