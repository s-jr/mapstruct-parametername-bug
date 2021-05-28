package de.example;

import org.mapstruct.Mapper;
import org.mapstruct.MappingInheritanceStrategy;

@Mapper(config = ExampleMapperConfig.class, mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_FROM_CONFIG)
public abstract class NewExampleMapper extends ExampleMapper {

    @Override
    public abstract TargetClass map(SourceClass source);
    // No property named "source" exists in source parameter(s). Did you mean "a"?

    @Override
    public abstract TargetClass map(SourceClass sourceForTargetClass, SourceClass sourceForTargetClassOther);
    // Method has no source parameter named "sourceForTargetClass". Method source parameters are: "sourceForTargetClass, sourceForTargetClassOther".
}
