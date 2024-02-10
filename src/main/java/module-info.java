module com.kirvel.qa_guru1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kirvel.qa_guru1 to javafx.fxml;
    exports com.kirvel.qa_guru1;
}