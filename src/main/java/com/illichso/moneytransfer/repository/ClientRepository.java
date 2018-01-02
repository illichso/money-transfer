package com.illichso.moneytransfer.repository;

import com.illichso.moneytransfer.model.Client;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ClientRepository extends ReactiveMongoRepository <Client, String> {
}
