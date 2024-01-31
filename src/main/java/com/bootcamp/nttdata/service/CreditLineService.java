package com.bootcamp.nttdata.service;

import com.bootcamp.nttdata.model.Credit;
import com.bootcamp.nttdata.model.dto.CreditLineByIdResponse;
import com.bootcamp.nttdata.model.dto.UpdateCreditConsumptionPaymentRequest;
import reactor.core.publisher.Mono;

public interface CreditLineService {

    public Mono<CreditLineByIdResponse> getCreditLineByIdCredit(String idCredit);
    public Mono<Credit> updateCreditConsumptionPayment(UpdateCreditConsumptionPaymentRequest trx); // 1:consumo 2:pagos
}
