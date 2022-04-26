package com.razortype.GameStoreSystem.business.concretes;

import com.razortype.GameStoreSystem.business.abstracts.GameOwnershipService;
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
    public List<GameOwnership> getAll() {
        return this.gameOwnershipDao.findAll();
    }

    @Override
    public List<GameOwnership> getAllByUserId(int id) {
        return this.gameOwnershipDao.findAllByUser_id(id);
    }

}
