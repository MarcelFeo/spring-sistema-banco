package com.banco.repositories;

import com.banco.domain.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransectionRepository extends JpaRepository<Transaction, Long> {
}
