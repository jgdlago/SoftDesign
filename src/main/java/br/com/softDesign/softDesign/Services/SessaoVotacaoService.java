package br.com.softDesign.softDesign.Services;

import br.com.softDesign.softDesign.Entities.SessaoVotacao;

public interface SessaoVotacaoService {
    SessaoVotacao abrirSessaoVotacao(SessaoVotacao sessaoVotacao);
    SessaoVotacao buscarSessaoVotacaoPorId(Long id);
}