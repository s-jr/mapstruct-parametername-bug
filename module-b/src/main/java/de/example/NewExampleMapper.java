package de.example;

import org.mapstruct.Mapper;
import org.mapstruct.MappingInheritanceStrategy;

@Mapper(config = ExampleMapperConfig.class, mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_FROM_CONFIG)
public abstract class NewExampleMapper extends ExampleMapper {

    @Override
    public abstract TargetParent map(Source source);
    // No property named "source" exists in source parameter(s). Did you mean "a"?

    @Override
    public abstract TargetParent map(Source sourceForParent, Source sourceForChild);
    // Method has no source parameter named "sourceForParent". Method source parameters are: "sourceForParent, sourceForChild".
}
