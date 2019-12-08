package com.hardelele.api.services;

import com.hardelele.api.models.InfoBoardModel;
import com.hardelele.api.repositories.InfoBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InfoBoardService {

    InfoBoardRepository infoBoardRepository;

    @Autowired
    public InfoBoardService(InfoBoardRepository infoBoardRepository) {
        this.infoBoardRepository = infoBoardRepository;
    }

    public void add(String title, String massage, String imgUrl) {
        InfoBoardModel info = new InfoBoardModel(title, massage, imgUrl);
        infoBoardRepository.save(info);
    }

    public Optional<InfoBoardModel> get(long id) {
        return infoBoardRepository.findById(String.valueOf(id));
    }

    public List<InfoBoardModel> getAll() {
        return infoBoardRepository.findAll();
    }

    public void delete(long id) {
        infoBoardRepository.deleteById(String.valueOf(id));
    }
}
