package com.hardelele.api.repositories;

import com.hardelele.api.models.InfoBoardModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InfoBoardRepositoryTest {

    InfoBoardRepository infoBoardRepository;

    @Autowired
    public InfoBoardRepositoryTest(InfoBoardRepository infoBoardRepository) {
        this.infoBoardRepository = infoBoardRepository;
    }

    @Test
    public void test() {
        InfoBoardModel infoBoard = new InfoBoardModel("some title","some info","https://someUrl");
        infoBoardRepository.save(infoBoard);
        ArrayList<InfoBoardModel> infoBoardsList = (ArrayList<InfoBoardModel>) infoBoardRepository.findAll();
        assertEquals("some title", infoBoardsList.get(0).getTitle());
    }
}
