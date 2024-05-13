package org.example.demo;

import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class Platform {
    private int levelwidht;

    private ArrayList<Node> Platfomrs;
    private ArrayList<Node> Box;
    private ArrayList<Node> Hints;
    private Node tile;

    public int getLevelwidht() {
        return levelwidht;
    }

    public Platform(int levelwidht) {
        this.levelwidht = levelwidht;
    }
    public ArrayList<Node> createPlatfomrs(Pane gameRoot){
        Platfomrs = new ArrayList<>();
        for (int i = 0; i < LevelData.LEVEL_ONE.length; i++) {
            String line = LevelData.LEVEL_ONE[i];
            for (int j = 0; j < line.length(); j++) {
                switch (line.charAt(j)){
                    case '1':
                        tile = new Tiles(j*60,i*60,60,60, Color.BROWN).getEntityAsNode();
                        Platfomrs.add(tile);
                        gameRoot.getChildren().add(tile);
                        break;
                }
            }
        }
        return Platfomrs;
    }
    public ArrayList<Node> createBox(Pane gameRoot){
        Box = new ArrayList<>();
        for (int i = 0; i < LevelData.LEVEL_ONE.length; i++) {
            String line = LevelData.LEVEL_ONE[i];
            for (int j = 0; j < line.length(); j++) {
                switch (line.charAt(j)){
                    case '2':

                        tile = new Tiles(j*60,i*60,60,60,Color.GOLD).getEntityAsNode();
                        Box.add(tile);
                        gameRoot.getChildren().add(tile);
                        break;

                }
            }
        }
        return Box;
    }
    public ArrayList<Node> createHints(Pane gameRoot){
        Hints = new ArrayList<>();
        for (int i = 0; i < LevelData.LEVEL_ONE.length; i++) {
            String line = LevelData.LEVEL_ONE[i];
            for (int j = 0; j < line.length(); j++) {
                switch (line.charAt(j)){
                    case '3':

                        tile = new Tiles(j*60,i*60,60,60,Color.GREEN).getEntityAsNode();
                        Hints.add(tile);
                        gameRoot.getChildren().add(tile);
                        break;
                }
            }
        }
        return Hints;
    }
}
