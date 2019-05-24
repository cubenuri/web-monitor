package com.cube.monitor.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cube.monitor.domain.Monitor;

public interface MonitorDao extends JpaRepository<Monitor, Long>{

}

