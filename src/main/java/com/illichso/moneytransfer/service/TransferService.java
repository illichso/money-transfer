package com.illichso.moneytransfer.service;

import com.illichso.moneytransfer.model.Transfer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TransferService {
    Flux<Transfer> all();
    Mono<Transfer> byId(String id);
}
