/**
 * 
 */
package com.cube.monitor.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import com.cube.comm.domain.AbstractEntity;

import lombok.Data;

/**
 * @author dhkim
 *
 */

@Data
@Entity
public class Monitor extends AbstractEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3685828710611727760L;

	@Id
	@SequenceGenerator(name = "monitor_generator", sequenceName = "monitor_sequence",
			initialValue = 1)
	@GeneratedValue(generator = "monitor_generator")
	private Long seq;

	@Column(nullable = false , length= NM)
	private String nmService;
	
	@Column(nullable = false ,length= URL)
	private String urlService;
	
	@Column(length= CODE )
	private String cdStatus;
	
	
}
