package br.com.softDesign.softDesign.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.softDesign.softDesign.Entities.Pauta;

@Repository
public interface PautaRepository extends JpaRepository<Pauta, Long> {
}
