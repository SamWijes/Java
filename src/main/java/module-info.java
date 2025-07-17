module org.example.javafxcss {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.web;
	requires java.desktop;


	opens org.example.javafxcss to javafx.fxml;
	exports org.example.javafxcss;
}