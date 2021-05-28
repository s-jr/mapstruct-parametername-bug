package de.example;

import org.mapstruct.MapperConfig;
import org.mapstruct.Mapping;

@MapperConfig
public interface ExampleMapperConfig {

    @Mapping(target = "child", source = "source")
    TargetClass map(SourceClass source);

    @Mapping(target = "a", source = "sourceForTargetClass.a")
    @Mapping(target = "child", source = "sourceForTargetClassOther")
    TargetClass map(SourceClass sourceForTargetClass, SourceClass sourceForTargetClassOther);
}
