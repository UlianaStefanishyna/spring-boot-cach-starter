package com.springboot.starter.cache.demo;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PhonePersonRepository extends CrudRepository<Person, String> {

    Optional<Person> findPersonByName(String name);
}
