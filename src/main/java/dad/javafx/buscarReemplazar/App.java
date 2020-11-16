package dad.javafx.buscarReemplazar;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
	
	private Label search;
	private TextField searchField;
	private Label replace;
	private TextField replaceField;
	private CheckBox mayusMinis;
	private CheckBox regularExp;
	private CheckBox searchBackwards;
	private CheckBox results;
	private Button searchButton;
	private Button replaceButton;
	private Button replaceAllButton;
	private Button closeButton;
	private Button helpButton;
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		//primera caja
		search = new Label("Buscar:");
		searchField = new TextField();
		
		replace = new Label("Reemplazar con:");
		replaceField = new TextField();
		
		
		VBox cajaLabels = new VBox(15,search,replace);
		VBox cajaFields = new VBox(5,searchField,replaceField);
		
		//caja que va dentro de la primera caja
		
		mayusMinis = new CheckBox("Mayusculas y minisculas");
		regularExp = new CheckBox("Expresion regular");
		searchBackwards = new CheckBox("Buscar del reves");
		results = new CheckBox("Resultados");
		
		VBox cajaChecks1 = new VBox(5,mayusMinis,regularExp);
		VBox cajaChecks2 = new VBox(5,searchBackwards,results);
		
		HBox cajaEnvoltorioChecks = new HBox(5,cajaChecks1,cajaChecks2);
		
		//vbox para todos los botones
		
		searchButton = new Button("Buscar");
		searchButton.setPrefWidth(120);
		
		replaceButton = new Button("Reemplazar");
		replaceButton.setPrefWidth(120);
		
		replaceAllButton = new Button("Reemplazar Todo");
		replaceAllButton.setPrefWidth(120);
		
		closeButton = new Button("Cerrar");
		closeButton.setPrefWidth(120);
		
		helpButton = new Button("Ayuda");
		helpButton.setPrefWidth(120);
		
		VBox cajaBotones = new VBox(5,searchButton,replaceButton,replaceAllButton,closeButton,helpButton); 
		
		VBox cajaTextosChecks = new VBox(5,cajaFields,cajaEnvoltorioChecks);
		
		
		GridPane root = new GridPane();
		root.setHgap(10);
		root.setVgap(10);
		root.setPadding(new Insets(10));
		root.setGridLinesVisible(false);
		root.add(cajaLabels,0,0);
		root.add(cajaTextosChecks,1,0);
		root.add(cajaBotones,2,0);
		
		ColumnConstraints [] cols = {
				new ColumnConstraints(),
				new ColumnConstraints()
			};
		
		
		cols[1].setHgrow(Priority.ALWAYS);
		cols[1].setHalignment(HPos.CENTER);
		
		root.getColumnConstraints().setAll(cols);
		
		
		Scene scene = new Scene(root,540,180);
		
		
		primaryStage.setTitle("Buscar y reemplazar");
		primaryStage.setScene(scene);
		primaryStage.show();
		

	}

	public static void main(String[] args) {
		launch(args);

	}

}
