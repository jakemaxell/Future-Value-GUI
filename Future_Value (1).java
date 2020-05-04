import java.util.Scanner;
import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.scene.control.*; 
import javafx.scene.layout.*; 
import javafx.stage.Stage; 
import javafx.event.ActionEvent; 
import javafx.event.EventHandler; 
import javafx.scene.canvas.*; 
import javafx.scene.web.*; 
import javafx.scene.layout.*; 
import javafx.scene.shape.*; 
import javafx.scene.*;

public class Future_Value extends Application{

	public TextField investment = new TextField();
	public TextField numberyears = new TextField();
	public TextField interest = new TextField();
	public TextField futurevalue = new TextField();
	public Button calculate = new Button("Calculate");
	
	
	
	public static void main(String[] args) {
		
		Application.launch(args);

	}
	
	public void start(Stage primaryStage) throws Exception{
		
		primaryStage.setTitle("Investiment-Value Calculator");
		Group root = new Group();
		
		calculate.setOnAction(e -> {
			double amount = Double.parseDouble(investment.getText());
			int years = Integer.parseInt(numberyears.getText());
			double interestrate = Double.parseDouble(interest.getText());
			double equation = Math.pow(1 + (interestrate / 100), years);
			double fvalue = amount * equation; 
			
			futurevalue.setText(String.format("$%.2f", fvalue));
		});
		
		GridPane gridpane = new GridPane();
		gridpane.setHgap(10);
		gridpane.setVgap(10);
		gridpane.add(new Label("  Investment Amount: "), 0, 0);
		gridpane.add(investment, 1, 0);
		gridpane.add(new Label("  Number of years: "), 0, 1);
		gridpane.add(numberyears, 1, 1);
		gridpane.add(new Label("  Annual Interest Rate: "), 0, 2);
		gridpane.add(interest, 1, 2);
		gridpane.add(new Label("  Future Value: "), 0, 3);
		gridpane.add(futurevalue, 1, 3);
		gridpane.add(calculate, 2, 4);
		
		Scene scene = new Scene(gridpane, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	
}

