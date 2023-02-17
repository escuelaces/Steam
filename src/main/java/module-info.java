module com.escuelaces.steam {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.escuelaces.steam to javafx.fxml;
    exports com.escuelaces.steam;
}