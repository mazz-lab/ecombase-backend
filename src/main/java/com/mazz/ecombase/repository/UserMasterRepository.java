package com.mazz.ecombase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mazz.ecombase.entity.UserMaster;

@Repository
public interface UserMasterRepository extends JpaRepository<UserMaster, Long> {

}
