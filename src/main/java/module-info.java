module com.example.movielibraryltu {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;




    opens com.example.movielibraryltu to javafx.fxml;
    exports com.example.movielibraryltu;
}