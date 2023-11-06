package com.example.filefox;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Cabinet_BrowserController implements Initializable {
    @FXML
    private TableView<Cabinet_Browser> table_info;
    @FXML
    private Button close;

    @FXML
    private void close(ActionEvent event) {
        Stage stage = (Stage) close.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TableColumn<Cabinet_Browser, Boolean> selectColumn = new TableColumn<>("");
        TableColumn<Cabinet_Browser, String> documentNameColumn = new TableColumn<>("Document Name");

        table_info.getColumns().addAll(selectColumn, documentNameColumn);

        selectColumn.setCellValueFactory(data -> data.getValue().selectProperty());
        selectColumn.setCellFactory(CheckBoxTableCell.forTableColumn(selectColumn));
        selectColumn.setStyle("-fx-background-color: white;");

        documentNameColumn.setCellValueFactory(new PropertyValueFactory<>("documentName"));
        documentNameColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        documentNameColumn.setStyle("-fx-background-color: #D9D9D9;");
        documentNameColumn.setStyle("-fx-table-cell-border-color: white;");
        documentNameColumn.setStyle("-fx-padding: 0px 0px 0px 10px;");

        ObservableList<Cabinet_Browser> data = FXCollections.observableArrayList();
        data.add(new Cabinet_Browser("2021 tax return.pdf", true));
        data.add(new Cabinet_Browser("2022 tax return.xls", false));
        data.add(new Cabinet_Browser("2023 tax return.pdf", true));
        data.add(new Cabinet_Browser("2023 tax return.pdf", false));
        data.add(new Cabinet_Browser("2023 tax return.pdf", false));
        data.add(new Cabinet_Browser("2023 tax return.pdf", false));
        documentNameColumn.setPrefWidth(770);
        selectColumn.setPrefWidth(50);
        table_info.setItems(data);
    }
}