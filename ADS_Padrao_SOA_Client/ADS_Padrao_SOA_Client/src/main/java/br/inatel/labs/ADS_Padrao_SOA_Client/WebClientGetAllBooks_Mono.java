package br.inatel.labs.ADS_Padrao_SOA_Client;

import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

public class WebClientGetAllBooks_Mono {
	
	public static void main() {
		
		Mono<BookDTO[]> monoArrayBook = WebClient.create("http://localhost:8080")
				.get()
				.uri("/book")
				.retrieve()
				.bodyToMono(BookDTO[].class);
		
		monoArrayBook.subscribe();
		
		BookDTO[] arrayBook =  monoArrayBook.block();
		
		for(BookDTO dto : arrayBook) {
			System.out.println(dto);
		}
		
	}

}
