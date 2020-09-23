package com.nisum.repository;

import com.nisum.document.Item;
import com.nisum.document.ItemCapped;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.Tailable;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ItemReactiveCappedRepository extends ReactiveMongoRepository<ItemCapped,String> {


    @Tailable
    Flux<ItemCapped> findItemsBy();
}
