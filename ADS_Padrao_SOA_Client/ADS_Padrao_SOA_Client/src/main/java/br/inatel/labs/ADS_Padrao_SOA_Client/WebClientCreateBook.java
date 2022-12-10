package br.inatel.labs.ADS_Padrao_SOA_Client;

import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

public class WebClientCreateBook {
	
	public static void main() {
		
		BookDTO newBook = new BookDTO();
		newBook.setTitle("Codigo Da Vinci");
		newBook.setCategory("Ficção");
		
		Mono<BookDTO[]> monoBook = WebClient.create("http://localhost:8080")
				.get()
				.uri("/book")
				.retrieve()
				.bodyToMono(BookDTO[].class);
		
		monoBook.subscribe();
		
		BookDTO[] createdBook =  monoBook.block();
		
		System.out.println(createdBook);
		
	}

}
