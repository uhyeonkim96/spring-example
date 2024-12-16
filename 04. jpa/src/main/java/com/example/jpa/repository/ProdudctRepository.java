package com.example.jpa.repository;

import com.example.jpa.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdudctRepository extends JpaRepository<Product, Long> {
}
