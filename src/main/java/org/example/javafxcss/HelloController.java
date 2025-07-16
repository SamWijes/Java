package org.example.javafxcss;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;

import java.io.File;

public class HelloController {

	@FXML
	private Label label;
	@FXML
	private Button button4;
	@FXML
	private GridPane gridpane;

	public void initialize() {
		button4.setEffect(new DropShadow());
	}
	@FXML
	public void handleMouseEnter() {
		label.setScaleY(2.0);
		label.setScaleX(2.0);
	}
	@FXML
	public void handleMouseExit() {
		label.setScaleY(1.0);
		label.setScaleX(1.0);
	}


	public void handleClick() {
		FileChooser chooser = new FileChooser();
//		DirectoryChooser chooser=new DirectoryChooser();
		chooser.setTitle("Save application File");
		chooser.getExtensionFilters().addAll(
				new FileChooser.ExtensionFilter("Text", "*.zip"),
				new FileChooser.ExtensionFilter("PDF", "*.pdf"),
				new FileChooser.ExtensionFilter("All Files", "*.*"));
		File file=chooser.showOpenDialog(gridpane.getScene().getWindow());
		if (file != null) {
			System.out.println(file.getPath());
		}else System.out.println("Chooser cancelled");
	}
	@FXML
	public void handleLinkClick(){
		System.out.println("link CLicked");
	}

}