package com.backend.DBSBackend.repository;

import com.backend.DBSBackend.models.account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<account,Long> {


}
