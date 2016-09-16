package org.ega_archive.elixirbeacon.repository.elixirbeacon;

import org.ega_archive.elixirbeacon.model.elixirbeacon.BeaconData;
//import org.ega_archive.elixircore.repository.CustomQuerydslJpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.support.QueryDslMongoRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

public interface BeaconDataRepository extends MongoRepository<BeaconData, String>, QueryDslPredicateExecutor<BeaconData> {

}
