package com.hardelele.api.controllers;

import com.hardelele.api.models.InfoBoardModel;
import com.hardelele.api.services.InfoBoardService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class InfoBoardVerticle {

    InfoBoardService infoBoardService;

    @Autowired
    public InfoBoardVerticle(InfoBoardService infoBoardService) {
        this.infoBoardService = infoBoardService;
    }

    public List<InfoBoardModel> getAll() {
        return infoBoardService.getAll();
    }

}
