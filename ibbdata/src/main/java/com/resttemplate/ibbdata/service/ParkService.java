package com.resttemplate.ibbdata.service;

import com.resttemplate.ibbdata.model.Park;
import org.springframework.stereotype.Service;

@Service
public interface ParkService {

    public void save(Park park);
}
