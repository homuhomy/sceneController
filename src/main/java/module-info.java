module com.example.scenecontroller {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.scenecontroller to javafx.fxml;
    exports com.example.scenecontroller;
}