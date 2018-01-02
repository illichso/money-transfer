package com.illichso.moneytransfer.rest;

import com.illichso.moneytransfer.model.Transfer;
import com.illichso.moneytransfer.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/transfers")
public class TransferController {

    private final TransferService transferService;

    @Autowired
    public TransferController(TransferService transferService) {
        this.transferService = transferService;
    }

    @GetMapping
    public Flux<Transfer> all() {
        return transferService.all();
    }

    @GetMapping("/{id}")
    public Mono<Transfer> byId(@PathVariable String id) {
        return transferService.byId(id);
    }

    @PostMapping
    public Mono<Transfer> save(@RequestBody Transfer transfer) {
        return transferService.save(transfer);
    }
}
