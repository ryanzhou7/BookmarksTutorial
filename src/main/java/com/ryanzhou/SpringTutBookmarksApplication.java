package com.ryanzhou;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ryanzhou.model.Account;
import com.ryanzhou.repository.AccountRepository;

@SpringBootApplication
public class SpringTutBookmarksApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTutBookmarksApplication.class, args);
	}

	@Bean
	CommandLineRunner init(AccountRepository accountRepository) {
		return (evt) -> Arrays.asList("jhoeller,dsyer,pwebb,ogierke,rwinch,mfisher,mpollack,jlong".split(","))
				.forEach(a -> {
					Account account = accountRepository.save(new Account(a, "password", "usa"));
				});
	}
}
