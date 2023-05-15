package br.com.softDesign.softDesign.Services;

import java.util.List;

import br.com.softDesign.softDesign.Entities.Pauta;

public interface PautaService {
    Pauta criarPauta(Pauta pauta);
    List<Pauta> listarPautas();
}
