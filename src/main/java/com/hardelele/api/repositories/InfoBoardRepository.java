package com.hardelele.api.repositories;

import com.hardelele.api.models.InfoBoardModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InfoBoardRepository extends MongoRepository<InfoBoardModel, String> {


}
