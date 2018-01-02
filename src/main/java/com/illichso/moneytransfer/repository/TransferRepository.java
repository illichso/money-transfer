package com.illichso.moneytransfer.repository;

import com.illichso.moneytransfer.model.Transfer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferRepository extends ReactiveMongoRepository <Transfer, String> {
}
