package br.com.softDesign.softDesign.ServicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class AssociadoService {

    private static final String USER_INFO_API_URL = "https://user-info.herokuapp.com/users/";

    private final WebClient webClient;

    @Autowired
    public AssociadoService(WebClient webClient) {
        this.webClient = webClient;
    }

    public boolean podeVotar(String cpf) {
        try {
            String url = USER_INFO_API_URL + cpf;
            InfoUsuarioResponse response = webClient.get()
                    .uri(url)
                    .retrieve()
                    .bodyToMono(InfoUsuarioResponse.class)
                    .block();
            return response != null && "ABLE_TO_VOTE".equals(response.getStatus());
        } catch (Exception e) {
            return false;
        }
    }

    public static class InfoUsuarioResponse {
        private String status;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }
}


