package com.example.filefox;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
public class Client_LookController implements Initializable {
    @FXML
    private TableView<Client_Look> table_info;
    @FXML
    private TableColumn<Client_Look, String> name;
    @FXML
    private TableColumn<Client_Look, String> id;
    @FXML
    private TableColumn<Client_Look, String> en;
    @FXML
    private Stage stage;
    @FXML
    private Scene scene;
    @FXML
    private Parent root;
    @FXML
    private Button close;
    @FXML
    private void close(ActionEvent event) {
        Stage stage = (Stage) close.getScene().getWindow();
        stage.close();
    }
    public void Select(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Client_LookMain.class.getResource("screen3.fxml"));
        root = fxmlLoader.load();
        stage =(Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initializeCols();
        loadData();

    }

    private void loadData() {
        ObservableList<Client_Look> data_table = FXCollections.observableArrayList();
        data_table.add(new Client_Look("AERO TRAINING SERVICE INC","10180000","10180000"));
        data_table.add(new Client_Look("RESEARCH & TRAINING NETWORK,INC","71856000","71856000"));
        data_table.add(new Client_Look("TOROXEL TRAINING SERVICE","78920000","78920000"));
        data_table.add(new Client_Look("TRAINING CLIENT 1001","99993001","99993001"));
        table_info.setItems(data_table);
    }
    private void initializeCols() {
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        id.setCellValueFactory(new PropertyValueFactory<>("client"));
        en.setCellValueFactory(new PropertyValueFactory<>("engagement"));
    }

}

