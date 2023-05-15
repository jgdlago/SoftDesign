package br.com.softDesign.softDesign.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.softDesign.softDesign.Entities.SessaoVotacao;
import br.com.softDesign.softDesign.ServicesImpl.SessaoVotacaoServiceImpl;

@RestController
@RequestMapping("/sessoes-votacao")
public class SessaoVotacaoController {

    private final SessaoVotacaoServiceImpl sessaoVotacaoService;

    @Autowired
    public SessaoVotacaoController(SessaoVotacaoServiceImpl sessaoVotacaoService) {
        this.sessaoVotacaoService = sessaoVotacaoService;
    }

    @PostMapping
    public ResponseEntity<SessaoVotacao> abrirSessaoVotacao(@RequestBody SessaoVotacao sessaoVotacao) {
        SessaoVotacao novaSessaoVotacao = sessaoVotacaoService.abrirSessaoVotacao(sessaoVotacao);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaSessaoVotacao);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SessaoVotacao> buscarSessaoVotacaoPorId(@PathVariable("id") Long id) {
        SessaoVotacao sessaoVotacao = sessaoVotacaoService.buscarSessaoVotacaoPorId(id);
        if (sessaoVotacao != null) {
            return ResponseEntity.ok(sessaoVotacao);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

