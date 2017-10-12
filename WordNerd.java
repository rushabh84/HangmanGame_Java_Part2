package hw2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class WordNerd extends Application{
	static BorderPane root = new BorderPane();
	Stage primaryStage;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		//enter code here
	}

	public void setupMenus() {
		//enter code here
	}
	

	private class AboutEventHandler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent event) {
			//enter code here
		}
	}
}
