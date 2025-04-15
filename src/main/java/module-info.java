module iub.ottplatform {
    requires javafx.controls;
    requires javafx.fxml;


    opens iub.ottplatform to javafx.fxml;
    exports iub.ottplatform;
}