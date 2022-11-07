package com.example.huhacha.repository;

import com.example.huhacha.entitis.Oder_detail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface Oder_detailRepository extends JpaRepository<Oder_detail, Long>, JpaSpecificationExecutor<Oder_detail> {
}