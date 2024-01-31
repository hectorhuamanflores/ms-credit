package com.bootcamp.nttdata.service;

import com.bootcamp.nttdata.model.Credit;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CreditService {

    public Flux<Credit> getAllCredit();
    public Mono<Credit> getCreditById(String id);
    public Mono<Credit> createCredit(Credit credit);
    public Mono<Credit> updateCredit(Credit credit);
    public Mono<Credit> deleteCredit(String id);
    public Flux<Credit> getCreditByDocumentNumber(Integer numdoc);

}
