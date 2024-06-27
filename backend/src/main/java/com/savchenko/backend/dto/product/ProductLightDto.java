package com.savchenko.backend.dto.product;

import com.savchenko.backend.dto.PhotoDto;
import com.savchenko.backend.dto.TagDto;
import com.savchenko.backend.dto.base.IdAndDatesDto;
import com.savchenko.backend.enums.ProductCategory;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ProductLightDto extends IdAndDatesDto {

    public final ProductCategory discriminator;

    public Long price;

    public Integer count;

    public Integer productionTime;

    public String title;

    public String description;

    public Float weight;

    public List<PhotoDto> photos;

    public List<TagDto> tags;

}
