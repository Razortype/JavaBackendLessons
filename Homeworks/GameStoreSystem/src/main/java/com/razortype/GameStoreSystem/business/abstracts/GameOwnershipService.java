package com.razortype.GameStoreSystem.business.abstracts;

import com.razortype.GameStoreSystem.core.result.DataResult;
import com.razortype.GameStoreSystem.entities.concretes.GameOwnership;

import java.util.List;

public interface GameOwnershipService {

    DataResult<List<GameOwnership>> getAll();

}
