package org.example.repository;

import org.example.models.Clients;
import org.springframework.data.repository.CrudRepository;
public interface ClientsRepository extends CrudRepository<Clients, Integer> {
}
