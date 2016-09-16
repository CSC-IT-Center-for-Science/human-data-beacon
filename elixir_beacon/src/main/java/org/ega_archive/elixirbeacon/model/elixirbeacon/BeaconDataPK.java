package org.ega_archive.elixirbeacon.model.elixirbeacon;

import java.io.Serializable;

import javax.persistence.*;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * The primary key class for the beacon_data database table.
 * 
 */
@Getter
@Setter
@EqualsAndHashCode
@Embeddable
public class BeaconDataPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String datasetId;

	private String chromosome;

	private Integer position;

	private String alternateBases;
	
	private String referenceGenome;

	public BeaconDataPK() {
	}

}