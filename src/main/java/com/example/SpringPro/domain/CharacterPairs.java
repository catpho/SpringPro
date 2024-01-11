package com.example.SpringPro.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterPairs extends CrudRepository<Pairs,Long>{

}
