package com.revature.ttapi.game.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.ttapi.game.models.Board;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class BoardConverter implements AttributeConverter<Board, String> {

    @Override
    public String convertToDatabaseColumn(Board board) {
        return board.toString();
    }

    @Override
    public Board convertToEntityAttribute(String s) {
        ObjectMapper om = new ObjectMapper();
        try {
            JsonNode top = om.readTree(s);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
//        s = "Game{" +
//                "id=" + id +
//                ", player1_username='" + player1_username + '\'' +
//                ", player2_username='" + player2_username + '\'' +
//                ", deck_p1=" + deck_p1 +
//                ", deck_p2=" + deck_p2 +
//                ", result='" + result + '\'' +
//                ", board=" + board +
//                ", currentPlayer='" + currentPlayer + '\'' +
//                '}';

        return null;
    }
}
