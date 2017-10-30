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

public class AddFunction implements Function{
	
	public int a;
	public int b;
	public int calc;
	public String result;
	TextField ta;
    public AddFunction(int first, TextField t)
    {
    	a = first;
    	ta = t;
    	b = 0;
    }
    
    public void Solve(int second)
    {
    	b = second;
    	ta.clear();
    	calc = a + b;
    	result = String.valueOf(calc);
    	
    	ta.setText(result);
    }
}
