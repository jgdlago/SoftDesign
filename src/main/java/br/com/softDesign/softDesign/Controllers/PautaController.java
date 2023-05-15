package br.com.softDesign.softDesign.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import br.com.softDesign.softDesign.Entities.Pauta;
import br.com.softDesign.softDesign.Services.PautaService;

import java.util.List;

@RestController
@RequestMapping("/pautas")
public class PautaController {

    private final PautaService pautaService;

    @Autowired
    public PautaController(PautaService pautaService) {
        this.pautaService = pautaService;
    }

    @PostMapping
    public ResponseEntity<Pauta> criarPauta(@RequestBody Pauta pauta) {
        Pauta novaPauta = pautaService.criarPauta(pauta);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaPauta);
    }

    @GetMapping
    public ResponseEntity<List<Pauta>> listarPautas() {
        List<Pauta> pautas = pautaService.listarPautas();
        return ResponseEntity.ok(pautas);
    }
}

