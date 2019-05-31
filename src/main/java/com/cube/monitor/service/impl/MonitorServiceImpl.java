package com.cube.monitor.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cube.monitor.dao.MonitorDao;
import com.cube.monitor.domain.Monitor;
import com.cube.monitor.service.MonitorService;

@Service("monitorService")
public class MonitorServiceImpl implements MonitorService {

	@Autowired
	MonitorDao monitorDao; 
	
	@Override
	public Optional<Monitor> get(long seq) {
		return monitorDao.findById(seq);
	}

	@Override
	public Monitor create(Monitor mon) {
		return monitorDao.save(mon);
	}

	@Override
	public Monitor update(Monitor mon) {
		return monitorDao.save(mon);
	}
}
