package org.ega_archive.elixirbeacon.repository.elixirbeacon;

import java.util.List;

import org.ega_archive.elixirbeacon.model.elixirbeacon.BeaconDataset;
import org.ega_archive.elixircore.repository.CustomQuerydslJpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Component;

@Repository
public interface BeaconDatasetRepository extends MongoRepository<BeaconDataset, String> {
  
  public Page<BeaconDataset> findByReferenceGenome(String referenceGenome, Pageable page);
  
//  @Query("SELECT d.id FROM BeaconDataset d WHERE d.referenceGenome=?1 AND d.accessType=?2 ORDER BY d.id")
  @Query("")
  public List<String> findByReferenceGenomeAndAccessType(String referenceGenome, String accessType);
  
}
