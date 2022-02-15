package br.com.teste.animaisms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Entity
public class Animal {
    @Id // vai transformar essa coluna em primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long dono;
    private String nome;
    private Integer idade;
    private String raca;
    private Boolean vivo;

    public Animal() {
        setVivo(true);
    }

  
}
