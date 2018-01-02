package com.illichso.moneytransfer.service.impl;

import com.illichso.moneytransfer.model.Transfer;
import com.illichso.moneytransfer.repository.TransferRepository;
import com.illichso.moneytransfer.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TransferServiceImpl implements TransferService {

    private final TransferRepository transferRepository;

    @Autowired
    public TransferServiceImpl(TransferRepository transferRepository) {
        this.transferRepository = transferRepository;
    }

    @Override
    public Flux<Transfer> all() {
        return transferRepository.findAll();
    }

    @Override
    public Mono<Transfer> byId(String id) {
        return transferRepository.findById(id);
    }
}
