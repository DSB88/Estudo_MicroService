package br.com.teste.primeirorest.service;

import java.util.List;
import java.util.Optional;

import br.com.teste.primeirorest.compartilhado.PessoaDto;

public interface PessoaService {
    PessoaDto criarPessoa(PessoaDto pessoa);
    List<PessoaDto> obterTodos();
    Optional<PessoaDto> obterPorId(Long id);
    void removerPessoa(Long id);
    PessoaDto atualizarPessoa(Long id, PessoaDto pessoa);
}
