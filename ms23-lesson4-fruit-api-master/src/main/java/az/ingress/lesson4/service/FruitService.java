package az.ingress.lesson4.service;

import az.ingress.lesson4.domain.FruitEntity;
import az.ingress.lesson4.dto.FruitRequestDto;
import az.ingress.lesson4.dto.FruitResponseDto;

import java.util.List;
import java.util.Optional;

public interface FruitService {

    List<FruitResponseDto> list(Integer from, Integer to);

    Optional<FruitEntity> get(Long id);


    FruitResponseDto create(FruitRequestDto fruitDto);


    FruitRequestDto update(Long id, FruitRequestDto fruitDto);

    void delete(Long id);

}
