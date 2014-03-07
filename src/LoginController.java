

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.event.Event;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class LoginController {
	
	Stage stage;
	LoginView loginview;
	
	
	public void initialize(Stage stage) {
		
		
		
		GridPane root = new GridPane();
		root.setAlignment(Pos.CENTER);
		root.setHgap(10);
		root.setVgap(10);
		root.setPadding(new Insets(25,25,25,25));
		
		
		
		root.add(addText("Start Here"), 0, 0, 2, 1);
		
		root.add(addLabel("User: "), 0, 1);
		root.add(new TextField(),1,1);
		
		root.add(addLabel("Password"), 0, 2);
		root.add(new TextField(),1,2);
		
		HBox startBut = new HBox(10);
		startBut.getChildren().add(addStartButton());
		startBut.setAlignment(Pos.BOTTOM_RIGHT);
		root.add(startBut,1,3);
		//try {
			Image image = new Image("/Resources/Icons/Lasagna.png");
		//} catch(RuntimeException e) {
			System.out.println("Runtime Exception");
		//}
		
		//stage.getIcons().add(image);	
		
		stage.setScene(new Scene(root, 300, 250));
		stage.show();
	}
	
	//initialize start button
	public Button addStartButton() {
		Button btn = new Button();
		btn.setText("Start");
		btn.setPrefWidth(100);
		btn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Printed something!");
			}
			
		});
		return btn;
	}
	
	public Text addText(String t) {
		Text someText = new Text(t);
		someText.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		
		return someText;
	}
	
	public Label addLabel(String t) {
		Label label = new Label(t);
		
		return label;
	}
	

	
	
	
}
