package com.igorcoura.documentmanager.infra.repository;

import com.igorcoura.documentmanager.domain.entities.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseEntityRepository extends JpaRepository<BaseEntity, Long> {
}