package br.com.teste.animaisms.service;

import java.util.List;
import java.util.Optional;

import br.com.teste.animaisms.compartilhado.AnimalDto;

public interface AnimalService {
    AnimalDto criarAnimal(AnimalDto animal);
    List<AnimalDto> obterTodos();
    Optional<AnimalDto> obterPorId(Long id);
    List<AnimalDto> obterPorDono(Long dono);
    void removerAnimal(Long id);
    boolean definirComoMorto(Long id);
    AnimalDto atualizarAnimal(Long id, AnimalDto animal);
}
