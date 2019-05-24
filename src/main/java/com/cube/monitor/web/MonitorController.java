package com.cube.monitor.web;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cube.monitor.dao.MonitorDao;
import com.cube.monitor.domain.Monitor;

@RestController
@RequestMapping("monitor")
public class MonitorController {
	
	@Autowired
	MonitorDao monitorDao;

	@GetMapping("/{index}")
	public Optional<Monitor> get(HttpServletRequest req,  @PathVariable long index)
	{
		return monitorDao.findById(index);
	}
	
	@PostMapping("/")
	public Monitor create(HttpServletRequest req, Monitor mon)
	{
		return monitorDao.save(mon);
	}
	
	@PutMapping("/")
	public Monitor update(HttpServletRequest req,  Monitor mon)
	{
		return monitorDao.save(mon);
	}
	
}

 
