package application;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Calculator extends Application{

   public Function currentFunction = null; 
   public boolean overwrite = false;
    @Override
    public void start(Stage primaryStage) {   	
    	//Setting up a grid
    	GridPane grid = new GridPane();
    	grid.setPadding(new Insets(10, 10, 10, 10));
    	
    	Label label1 = new Label("=");
    	TextField output = new TextField();
    	grid.setVgap(15);
    	grid.setHgap(10);
    	GridPane.setConstraints(label1, 0, 0);
    	grid.getChildren().add(label1);
    	GridPane.setConstraints(output, 1, 0);
    	grid.getChildren().add(output);
    	
    	
    	//Row 2 has "1, 2, 3, +"
    	GridPane grid2 = new GridPane();
    	grid2.setPadding(new Insets(50, 10, 10, 30));
    	grid2.setHgap(25);
    	grid2.setVgap(15);
    	
    	Button btn1 = new Button();
    	btn1.setText("1");
    	btn1.setOnAction(new EventHandler<ActionEvent>() {
       	 
            @Override
            public void handle(ActionEvent event) {
            	if(overwrite)
            		{output.clear(); overwrite = false; }
                output.appendText("1");
            }
        });
    	
    	Button btn2 = new Button();
    	btn2.setText("2");
    	btn2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
            	if(overwrite)
            		{output.clear(); overwrite = false; }
                output.appendText("2");
            }
        });
    	
    	Button btn3 = new Button();
    	btn3.setText("3");
    	btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	if(overwrite)
            		{output.clear(); overwrite = false; }
                output.appendText("3");
            }
        });
    	
        Button btnplus = new Button();
        btnplus.setText("+");
        btnplus.setOnAction(new EventHandler<ActionEvent>() {
        	 
            @Override
            public void handle(ActionEvent event) {
                if(currentFunction == null)
                {
                	currentFunction = new AddFunction(Integer.valueOf(output.getText()), output);
                	output.clear();
                }
            }
        });
        
        GridPane.setConstraints(btn1, 0, 0);
        GridPane.setConstraints(btn2, 1, 0);
        GridPane.setConstraints(btn3, 2, 0);
        GridPane.setConstraints(btnplus, 3, 0);
        
        grid2.getChildren().add(btn1);
        grid2.getChildren().add(btn2);
        grid2.getChildren().add(btn3);
        grid2.getChildren().add(btnplus);
        
        //Row 3 Has "4, 5, 6, -"
        Button btn4 = new Button();
    	btn4.setText("4");
    	btn4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	if(overwrite)
            		{output.clear(); overwrite = false; }
                output.appendText("4");
            }
        });
    	
    	Button btn5 = new Button();
    	btn5.setText("5");
    	btn5.setOnAction(new EventHandler<ActionEvent>() {
          	 
            @Override
            public void handle(ActionEvent event) {
            	if(overwrite)
            		{output.clear(); overwrite = false; }
                output.appendText("5");
            }
        });
    	
    	Button btn6 = new Button();
    	btn6.setText("6");
    	btn6.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
            	if(overwrite)
            		{output.clear(); overwrite = false; }
                output.appendText("6");
            }
        });
    	
        Button btnmin = new Button();
        btnmin.setText("-");
        btnmin.setOnAction(new EventHandler<ActionEvent>() {
          	 
            @Override
            public void handle(ActionEvent event) {
            	if(currentFunction == null)
                {
                	currentFunction = new SubFunction(Integer.valueOf(output.getText()), output);
                	output.clear();
                }
            }
        });
        
        GridPane.setConstraints(btn4, 0, 1);
        GridPane.setConstraints(btn5, 1, 1);
        GridPane.setConstraints(btn6, 2, 1);
        GridPane.setConstraints(btnmin, 3, 1);
        
        grid2.getChildren().add(btn4);
        grid2.getChildren().add(btn5);
        grid2.getChildren().add(btn6);
        grid2.getChildren().add(btnmin);
        //
        
      //Row 4 Has "7, 8, 9, x"
        Button btn7 = new Button();
    	btn7.setText("7");
    	btn7.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
            	if(overwrite)
            		{output.clear(); overwrite = false; }
                output.appendText("7");
            }
        });
    	
    	Button btn8 = new Button();
    	btn8.setText("8");
    	btn8.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
            	if(overwrite)
            		{output.clear(); overwrite = false; }
                output.appendText("8");
            }
        });
    	
    	Button btn9 = new Button();
    	btn9.setText("9");
    	btn9.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
            	if(overwrite)
            		{output.clear(); overwrite = false; }
                output.appendText("9");
            }
        });
    	
        Button btnmul = new Button();
        btnmul.setText("x");
        btnmul.setOnAction(new EventHandler<ActionEvent>() {
          	 
            @Override
            public void handle(ActionEvent event) {
            	if(currentFunction == null)
                {
                	currentFunction = new MultFunction(Integer.valueOf(output.getText()), output);
                	output.clear();
                }
            }
        });
        
        GridPane.setConstraints(btn7, 0, 2);
        GridPane.setConstraints(btn8, 1, 2);
        GridPane.setConstraints(btn9, 2, 2);
        GridPane.setConstraints(btnmul, 3, 2);
        
        grid2.getChildren().add(btn7);
        grid2.getChildren().add(btn8);
        grid2.getChildren().add(btn9);
        grid2.getChildren().add(btnmul);
        //
        
      //Row 5 Has "0, , , /"
        Button btn0 = new Button();
    	btn0.setText("0");
    	btn0.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
            	if(overwrite)
            		{output.clear(); overwrite = false; }
                output.appendText("0");
            }
        });
    	
    	//Clear Button
    	Button btnclr = new Button();
    	btnclr.setText("C");
    	btnclr.setOnAction(new EventHandler<ActionEvent>() {
          	 
            @Override
            public void handle(ActionEvent event) {
                {output.clear(); overwrite = false; }
            }
        });
    	Button btneq = new Button();
    	btneq.setText("=");
    	btneq.setOnAction(new EventHandler<ActionEvent>() {
       	 
            @Override
            public void handle(ActionEvent event) {
                if(currentFunction != null)
                {
                	currentFunction.Solve(Integer.valueOf(output.getText()));
                	currentFunction = null;
                	overwrite = true;
                }
            }
        });
    	
        Button btndiv = new Button();
        btndiv.setText("/");
        btndiv.setOnAction(new EventHandler<ActionEvent>() {
         	 
            @Override
            public void handle(ActionEvent event) {
            	if(currentFunction == null)
                {
                	currentFunction = new DivFunction(Integer.valueOf(output.getText()), output);
                	output.clear();
                }
            }
        });
        
        GridPane.setConstraints(btn0, 0, 3);
        GridPane.setConstraints(btnclr, 1, 3);
        GridPane.setConstraints(btneq, 2, 3);
        GridPane.setConstraints(btndiv, 3, 3);
        
        grid2.getChildren().add(btn0);
        grid2.getChildren().add(btnclr);
        grid2.getChildren().add(btneq);
        grid2.getChildren().add(btndiv);
        //
        StackPane root = new StackPane();
        root.getChildren().add(grid);
        root.getChildren().add(grid2);

        
        
        
        
 Scene scene = new Scene(root, 275, 250);

        primaryStage.setTitle("Calc");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 public static void main(String[] args) {
        launch(args);
    }
}