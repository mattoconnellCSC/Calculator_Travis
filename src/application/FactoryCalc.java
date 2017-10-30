package application;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TestFXinstallation extends Application{

   
    @Override
    public void start(Stage primaryStage) {
    	Label label1 = new Label("=");
    	TextField output = new TextField();
        Button btnplus = new Button();
        btnplus.setText("Say 'Hello World'");
        btnplus.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!!!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btnplus);

        
        
        
        
 Scene scene = new Scene(root, 500, 350);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 public static void main(String[] args) {
        launch(args);
    }
}