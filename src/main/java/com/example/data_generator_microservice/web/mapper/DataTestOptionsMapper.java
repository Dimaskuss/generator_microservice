package com.example.data_generator_microservice.web.mapper;

import com.example.data_generator_microservice.model.test.DataTestOptions;
import com.example.data_generator_microservice.web.dto.DataTestOptionsDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataTestOptionsMapper
        extends Mappable<DataTestOptions, DataTestOptionsDto> {
}
