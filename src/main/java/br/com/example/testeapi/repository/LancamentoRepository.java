package br.com.example.testeapi.repository;

import br.com.example.testeapi.model.Lancamento;
import br.com.example.testeapi.repository.lancamento.LancamentoRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {
}
