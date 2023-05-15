package br.com.softDesign.softDesign.ServicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.softDesign.softDesign.Entities.Pauta;
import br.com.softDesign.softDesign.Repositories.PautaRepository;
import br.com.softDesign.softDesign.Services.PautaService;

import java.util.List;

@Service
public class PautaServiceImpl implements PautaService {

    private final PautaRepository pautaRepository;

    @Autowired
    public PautaServiceImpl(PautaRepository pautaRepository) {
        this.pautaRepository = pautaRepository;
    }

    @Override
    public Pauta criarPauta(Pauta pauta) {
        return pautaRepository.save(pauta);
    }

    @Override
    public List<Pauta> listarPautas() {
        return pautaRepository.findAll();
    }
}

