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
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
public class Load_CabinetController implements Initializable {
    @FXML
    private TableView<Load_Cabinet> table_info;
    @FXML
    private TableColumn<Load_Cabinet, String> cabinet;
    @FXML
    private TableColumn<Load_Cabinet, String> file;
    @FXML
    private TableColumn<Load_Cabinet, String> client;
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Button close;
    @FXML
    private void close(ActionEvent event) {
        Stage stage = (Stage) close.getScene().getWindow();
        stage.close();
    }

    public void Screen2(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Load_CabinetMain.class.getResource("Client_Look.fxml"));
        root = fxmlLoader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
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
        ObservableList<Load_Cabinet> data_table = FXCollections.observableArrayList();
        data_table.add(new Load_Cabinet("ALFA", "F:\\LITAL", " "));
        data_table.add(new Load_Cabinet("Client", "F:\\CL", "YES"));
        data_table.add(new Load_Cabinet("CPE Archive", "F:\\CPEArchive", " "));
        data_table.add(new Load_Cabinet("E-Archive", "F:\\EARCHIVE", " "));
        table_info.setItems(data_table);
    }

    private void initializeCols() {
        cabinet.setCellValueFactory(new PropertyValueFactory<>("cabinet"));
        file.setCellValueFactory(new PropertyValueFactory<>("file"));
        client.setCellValueFactory(new PropertyValueFactory<>("client"));
        /* for red color font in the client coloumn */
        client.setCellFactory(column -> {
            return new TableCell<Load_Cabinet, String>() {
                @Override
                protected void updateItem(String item, boolean empty) {
                    super.updateItem(item, empty);
                    if (item == null || empty) {
                        setText(null);
                        setStyle("");
                    } else {
                        setText(item);
                        setTextFill(Color.RED);
                    }
                }
            };
        });
    }
}
