package com.savchenko.backend.converter.base;

public abstract class DomainConverter<Entity, DtoLight, DtoFull extends DtoLight> {

    public DtoLight convertLight(Entity entity) {
        var dtoLight = createDtoLight(entity);

        convertLight(entity, dtoLight);

        return dtoLight;
    }

    public DtoFull convertFull(Entity entity) {
        var dtoFull = createDtoFull(entity);

        convertLight(entity, dtoFull);
        convertFull(entity, dtoFull);

        return dtoFull;
    }

    protected abstract void convertLight(Entity entity, DtoLight dto);

    protected abstract void convertFull(Entity entity, DtoFull dto);

    private DtoLight createDtoLight(Entity entity) {
        return null;
    }

    private DtoFull createDtoFull(Entity entity) {
        return null;
    }

}
