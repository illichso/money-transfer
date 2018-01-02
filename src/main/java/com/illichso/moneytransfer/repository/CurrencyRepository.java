package com.illichso.moneytransfer.repository;

import com.illichso.moneytransfer.model.Currency;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyRepository extends ReactiveMongoRepository <Currency, String> {
}
