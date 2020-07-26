package com.resttemplate.ibbdata.service.impl;

import com.resttemplate.ibbdata.model.Park;
import com.resttemplate.ibbdata.repository.ParkRepository;
import com.resttemplate.ibbdata.service.ParkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParkServiceImpl implements ParkService {

    @Autowired
    private ParkRepository parkRepository;

    @Override
    public void save(Park park) {
        if (park != null)
            parkRepository.save(park);
    }
}
