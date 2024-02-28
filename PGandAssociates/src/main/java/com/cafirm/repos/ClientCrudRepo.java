package com.cafirm.repos;

import com.cafirm.entity.Clients;
import org.springframework.data.jpa.repository.JpaRepository;





public interface ClientCrudRepo extends JpaRepository<Clients, Integer> {
}
