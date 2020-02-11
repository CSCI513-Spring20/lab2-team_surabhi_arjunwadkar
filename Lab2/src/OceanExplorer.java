import java.awt.Point;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class OceanExplorer extends Application{
	boolean[][] islandMap;
	Pane root;
	final int dimensions = 10;
	final int islandCount = 10;
	final int scalingFactor = 50;
	Image shipImage;
	ImageView shipImageView;
	OceanMap oceanMap;
	Scene scene;
	Ship ship;
	
@Override
public void start(Stage mapStage) throws Exception{
		oceanMap = new oceanMap(dimensions,, islandCount);
		islandMap = oceanMap.getMap();
		
		root = new AnchorPane();
		drawMap();
		
		ship = new ship(oceanMap);
		loadShipImage();
		
		scene = new Scene(root, 500, 500);
		mapStage.setTitle("CC");
		mapStage.setScene(scene);
		mapStage.show();
		startSailing();
	}
}
