package com.illichso.moneytransfer.repository;

import com.illichso.moneytransfer.model.Transfer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface TransferRepository extends ReactiveMongoRepository <Transfer, String> {
}
