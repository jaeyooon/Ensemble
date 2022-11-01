package com.multi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.EventblDTO;
import com.multi.frame.MyService;
import com.multi.mapper.EventblMapper;

@Service
public class EventblService implements MyService<Integer, EventblDTO> {
	
	@Autowired
	EventblMapper mapper;

	@Override
	public void register(EventblDTO v) throws Exception {
		mapper.insert(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}

	@Override
	public void modify(EventblDTO v) throws Exception {
		mapper.update(v);
	}

	@Override
	public EventblDTO get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<EventblDTO> get() throws Exception {
		return mapper.selectall();
	}
	


}
