# SoftDesign
O projeto foi desenvolvido com PostgreSQL, as configurações para o conexão do banco devem ser as seguintes:
name: softdesign_db
port: 5432
host: localhost

As urls para teste da API são:
http://localhost:8080/pautas
http://localhost:8080/sessoes-votacao

Exemplos de teste:
sessoes-votacao:
{
  "pautaId": 1,
  "dataAbertura": "2023-05-15T09:00:00",
  "dataEncerramento": "2023-05-15T10:00:00"
}

pautas:
{
  "titulo": "Exemplo de Pauta",
  "descricao": "Esta é uma pauta de exemplo",
  "status": "ABERTA",
  "votos": []
}
