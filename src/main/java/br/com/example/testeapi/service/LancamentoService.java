package br.com.example.testeapi.service;

import br.com.example.testeapi.model.Lancamento;
import br.com.example.testeapi.model.Pessoa;
import br.com.example.testeapi.repository.LancamentoRepository;
import br.com.example.testeapi.repository.PessoaRepository;
import br.com.example.testeapi.service.exception.PessoaInexistenteOuInativaException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LancamentoService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private LancamentoRepository lancamentoRepository;

    public Lancamento salvar(Lancamento lancamento) {
        Pessoa pessoa = pessoaRepository.findById(lancamento.getPessoa().getCodigo()).orElse(null);
        if (pessoa == null || pessoa.isInativo()){
            throw new PessoaInexistenteOuInativaException();
        }
        return lancamentoRepository.save(lancamento);
    }
}
