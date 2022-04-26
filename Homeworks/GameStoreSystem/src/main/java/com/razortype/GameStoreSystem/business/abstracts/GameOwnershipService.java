package com.razortype.GameStoreSystem.business.abstracts;

import com.razortype.GameStoreSystem.entities.concretes.GameOwnership;

import java.util.List;

public interface GameOwnershipService {

    List<GameOwnership> getAll();
    List<GameOwnership> getAllByUserId(int id);

}
