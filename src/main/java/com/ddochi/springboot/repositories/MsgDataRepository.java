package com.ddochi.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ddochi.springboot.MsgData;

public interface MsgDataRepository 
	extends JpaRepository<MsgData, Long> {
	
}
