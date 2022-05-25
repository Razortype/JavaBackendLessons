package com.razortype.GameStoreSystem.dataAccess.abstracts;


import com.razortype.GameStoreSystem.entities.concretes.GameOwnership;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GameOwnershipDao extends JpaRepository<GameOwnership, Integer> {

}
