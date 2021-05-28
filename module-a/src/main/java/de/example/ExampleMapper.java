package de.example;

import org.mapstruct.Mapper;

@Mapper(config = ExampleMapperConfig.class)
public abstract class ExampleMapper implements ExampleMapperConfig {
    // Generation works for the methods defined in the interface
}
