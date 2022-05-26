package com.razortype.GameStoreSystem.business.concretes;

import com.razortype.GameStoreSystem.business.abstracts.GameOwnershipService;
import com.razortype.GameStoreSystem.core.result.DataResult;
import com.razortype.GameStoreSystem.core.result.SuccessDataResult;
import com.razortype.GameStoreSystem.dataAccess.abstracts.GameOwnershipDao;
import com.razortype.GameStoreSystem.entities.concretes.GameOwnership;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class GameOwnershipManager implements GameOwnershipService {

    private final GameOwnershipDao gameOwnershipDao;

    @Override
    public DataResult<List<GameOwnership>> getAll() {
        List<GameOwnership> gameOwnerships = this.gameOwnershipDao.findAll();
        return new SuccessDataResult<>(gameOwnerships, "All ownership data executed!");
    }

}
