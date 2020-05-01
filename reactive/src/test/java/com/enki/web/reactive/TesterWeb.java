package com.enki.web.reactive;

import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TesterWeb {
	
	@Test
	public void monoClientTest() throws InterruptedException{
		Mono<Object> map = WebClient.create("http://localhost:8080")
		.get()
		.uri("/person/{0}",1)
		.accept(MediaType.APPLICATION_JSON)
		.exchange()
		.flatMap(response -> response.bodyToMono(Map.class))
		.map(response -> response.get("name"));
		Assertions.assertTrue("bryan".equals(map.block().toString()));
	}

}
