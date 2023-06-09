package com.example.vocabulary;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.util.Arrays;

public class HelloController {
    public ListView listView = new ListView<>();

    // ArrayList
    // LinkedList
    // ArrayDeque

    public void action(ActionEvent actionEvent) {
        // if (collection is not empty yet
        // listview.getItems().add(collection.value)
        listView.getItems().add("Archil");
        listView.getItems().add("Ivan");
    }
}