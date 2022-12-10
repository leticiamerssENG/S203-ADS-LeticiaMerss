package br.inatel.labs.ADS_Padrao_SOA_Client;

import org.springframework.http.ResponseEntity;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

public class WebClientUpdateBook {
	
	public static void main() {
			
			BookDTO existingBook = new BookDTO();
			existingBook.setId(3L);
			existingBook.setTitle("Cozinha Mineira na Fazenda");
			existingBook.setCategory("Gastronomia regional");
			
			Mono<ResponseEntity<Void>> monoVoid = WebClient.create("http://localhost:8080")
					.put()
					.uri("/book")
					.bodyValue(existingBook)
					.retrieve()
					.toBodilessEntity();
			
			monoVoid.subscribe();
			
			ResponseEntity<Void> responseEntity =  monoVoid.block();
			
			System.out.println(responseEntity.getStatusCode());
			
		}

}
