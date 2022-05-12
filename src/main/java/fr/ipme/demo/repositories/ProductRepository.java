package fr.acl.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.acl.demo.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}