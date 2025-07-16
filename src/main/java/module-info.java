module org.example.javafxcss {
	requires javafx.controls;
	requires javafx.fxml;


	opens org.example.javafxcss to javafx.fxml;
	exports org.example.javafxcss;
}