package application;

import javafx.scene.control.TextField;

public class MultFunction implements Function {

	public int a;
	public int b;
	public int calc;
	public String result;
	TextField ta;
    public MultFunction(int first, TextField t)
    {
    	a = first;
    	ta = t;
    	b = 0;
    }
    
    public void Solve(int second)
    {
    	b = second;
    	ta.clear();
    	calc = a * b;
    	result = String.valueOf(calc);
    	
    	ta.setText(result);
    }
}
