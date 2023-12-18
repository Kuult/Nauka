package wprowadzenieDoJaxyFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;


/**
 * Created by Piotr on 04.11.2023.
 */
public class PierwszaAplikacja extends Application {


	@Override
	public void start(Stage primaryStage) throws Exception {

		BorderPane layout = new BorderPane();

		Scene scene = new Scene(layout, 400, 200);

		TextField textField = new TextField();

		Label label = new Label("Average 0.0");

		Button button = new Button("Przycisk");
		button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				String textFromTextFielde = textField.getText();
				String[] splitedText = textFromTextFielde.split(",");
				double average = 0.0;
				for (String s: splitedText){
					average += Double.parseDouble(s);
				}
				average /= splitedText.length;
				label.setText("Average: " + average);
			}
		});

		VBox vBox = new VBox();
		vBox.getChildren().addAll(textField, button, label);
		vBox.setAlignment(Pos.CENTER);
		vBox.setSpacing(10);

		layout.setCenter(vBox);

		primaryStage.setScene(scene);
		primaryStage.setTitle("Moja pierwsza aplikacja");
		primaryStage.show();
	}
}
