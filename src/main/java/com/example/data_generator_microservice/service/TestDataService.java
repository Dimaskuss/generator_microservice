package com.example.data_generator_microservice.service;

import com.example.data_generator_microservice.model.test.DataTestOptions;

public interface TestDataService {

    void sendMassages(DataTestOptions dataTestOptions);
}
