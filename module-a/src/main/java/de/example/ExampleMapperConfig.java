package de.example;

import org.mapstruct.MapperConfig;
import org.mapstruct.Mapping;

@MapperConfig
public interface ExampleMapperConfig {

    @Mapping(target = "child", source = "source")
    TargetParent map(Source source);

    @Mapping(target = "a", source = "sourceForParent.a")
    @Mapping(target = "child", source = "sourceForChild")
    TargetParent map(Source sourceForParent, Source sourceForChild);
}
