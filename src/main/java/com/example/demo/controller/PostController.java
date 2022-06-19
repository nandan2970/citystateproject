package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/posts")
@Slf4j
public class PostController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping
	public ResponseEntity<Object> getPosts() {
		ResponseEntity<Object> res = null;
		try {

//			HttpEntity<Object> entity = new HttpEntity<Object>();

			res = restTemplate.exchange("https://jsonplaceholder.typicode.com/posts", HttpMethod.GET,
					this.getHttpEntity(),Object.class);
//			res = restTemplate.getForEntity("https://jsonplaceholder.typicode.com/posts", Object.class);
		} catch (Exception e) {
			log.error(e.getMessage());
		}

		return res;
	}

	public HttpEntity<Object> getHttpEntity() {

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		return new HttpEntity<Object>(headers);

	}

}
