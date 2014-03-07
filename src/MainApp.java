
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class MainApp extends Application {
	
	private final float VERSION = 0.1f;
	
	private LoginController loginController = new LoginController();
	
	@Override
	public void start(Stage primaryStage) {
		
		primaryStage.setResizable(false);
		primaryStage.setTitle("Login Screen" + VERSION);
		
		loginController.initialize(primaryStage);	
		//primaryStage.show();
		
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}

}
