package br.com.softDesign.softDesign.Entities;

import br.com.softDesign.softDesign.Enums.OpcaoVoto;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "votos")
public class Voto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "pauta_id")
    private Pauta pauta;

    private String associadoId;

    @Enumerated(EnumType.STRING)
    private OpcaoVoto opcao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Pauta getPauta() {
		return pauta;
	}

	public void setPauta(Pauta pauta) {
		this.pauta = pauta;
	}

	public String getAssociadoId() {
		return associadoId;
	}

	public void setAssociadoId(String associadoId) {
		this.associadoId = associadoId;
	}

	public OpcaoVoto getOpcao() {
		return opcao;
	}

	public void setOpcao(OpcaoVoto opcao) {
		this.opcao = opcao;
	}


}

