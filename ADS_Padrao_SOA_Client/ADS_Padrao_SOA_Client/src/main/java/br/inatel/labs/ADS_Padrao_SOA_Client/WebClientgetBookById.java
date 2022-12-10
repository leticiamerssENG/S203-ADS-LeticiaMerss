package br.inatel.labs.ADS_Padrao_SOA_Client;

import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

public class WebClientgetBookById {
	
	public static void main() {
			
			Mono<BookDTO[]> monoBook = WebClient.create("http://localhost:8080")
					.get()
					.uri("/book/1")
					.retrieve()
					.bodyToMono(BookDTO[].class);
			
			monoBook.subscribe();
			
			BookDTO[] dto =  monoBook.block();
			
			System.out.println(dto);
			
		}

}
