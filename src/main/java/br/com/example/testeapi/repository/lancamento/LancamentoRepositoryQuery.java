package br.com.example.testeapi.repository.lancamento;



import br.com.example.testeapi.model.Lancamento;
import br.com.example.testeapi.repository.filter.LancamentoFilter;
import br.com.example.testeapi.repository.projection.ResumoLancamento;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface LancamentoRepositoryQuery {

    Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
    Page<ResumoLancamento> resumir(LancamentoFilter lancamentoFilter, Pageable pageable);

}
