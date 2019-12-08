package com.hardelele.api.repositories;

import com.hardelele.api.models.InfoBoardModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoBoardRepository extends MongoRepository<InfoBoardModel, String> {

}
