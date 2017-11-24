package application;
	
import java.io.IOException;

import com.bohonalo.controles.ventana.OpcionesVentana;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;



public class Main extends Application {
	Stage stage;
	OpcionesVentana c = new OpcionesVentana();
	@Override
	public void start(Stage primaryStage) {
		try {
			stage = primaryStage;
			mainWindow();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void mainWindow() {
		try {
			
			FXMLLoader loader=new FXMLLoader(getClass().getResource("ventana.fxml"));
	        AnchorPane pane=loader.load();
	        c.moverVentanaScene(pane, stage);
	        stage.initStyle(StageStyle.UNDECORATED);
	        stage.setScene(new Scene(pane));
	        stage.show();


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
