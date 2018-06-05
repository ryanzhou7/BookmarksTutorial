package com.ryanzhou.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ryanzhou.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{
	Optional<Account> findByUsername(String username);
	Optional<Account> findByLocation(String location);
}
