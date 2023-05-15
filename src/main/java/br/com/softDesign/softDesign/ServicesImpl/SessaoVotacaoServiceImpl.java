package br.com.softDesign.softDesign.ServicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.softDesign.softDesign.Entities.SessaoVotacao;
import br.com.softDesign.softDesign.Repositories.SessaoVotacaoRepository;
import br.com.softDesign.softDesign.Services.SessaoVotacaoService;

@Service
public class SessaoVotacaoServiceImpl implements SessaoVotacaoService {

    private final SessaoVotacaoRepository sessaoVotacaoRepository;

    @Autowired
    public SessaoVotacaoServiceImpl(SessaoVotacaoRepository sessaoVotacaoRepository) {
        this.sessaoVotacaoRepository = sessaoVotacaoRepository;
    }

    @Override
    public SessaoVotacao abrirSessaoVotacao(SessaoVotacao sessaoVotacao) {
        return sessaoVotacaoRepository.save(sessaoVotacao);
    }

    @Override
    public SessaoVotacao buscarSessaoVotacaoPorId(Long id) {
        return sessaoVotacaoRepository.findById(id).orElse(null);
    }
}

