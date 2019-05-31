package com.cube.monitor.service;

import java.util.Optional;

import com.cube.monitor.domain.Monitor;

public interface MonitorService {

	Optional<Monitor> get(long seq);
	Monitor create(Monitor mon);
	Monitor update(Monitor mon);
	
}
