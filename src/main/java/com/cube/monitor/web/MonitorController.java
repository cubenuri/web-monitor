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

import com.cube.monitor.domain.Monitor;
import com.cube.monitor.service.MonitorService;

@RestController
@RequestMapping("monitor")
public class MonitorController {
	
	@Autowired
	MonitorService monitorService;

	@GetMapping("/{index}")
	public Optional<Monitor> get(HttpServletRequest req,  @PathVariable long index)
	{
		return monitorService.get(index);
	}
	
	@PostMapping("/")
	public Monitor create(HttpServletRequest req, Monitor mon)
	{
		return monitorService.create(mon);
	}
	
	@PutMapping("/")
	public Monitor update(HttpServletRequest req,  Monitor mon)
	{
		return monitorService.update(mon);
	}
	
}

 
