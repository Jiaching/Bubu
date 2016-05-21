package Bubu.Constants;

public class Constants {
	// Window
	public static int WINDOW_WIDTH = 700;
	public static int WINDOW_HEIGHT = 640;
	public static int WINDOW_BAR_HEIGHT = 40;
	public static int ANCHOR_OFFSET_X = 60;
	public static int ANCHOR_OFFSET_Y = 60;

	// Component
	public static int INIT_COMPONENT_X = WINDOW_WIDTH/2 +100;
	public static int INIT_COMPONENT_BUTTON_X = WINDOW_WIDTH/2;
	public static int COMPONENT_WIDTH = 150;
	public static int COMPONENT_LABEL_HEIGHT = 30;
	public static int COMPONENT_TEXTFIELD_HEIGHT = 20;
	
	// Car
	public static int CAR_RADIUS = 30;
	public static int CAR_WIDTH = 60;
	public static int CAR_HEIGHT = 60;
	public static int SENSOR_DETECT_DISTANCE = 20;

	//Sensor
	public static int SENSOR_DETECT_MAX_DISTANCE = 180;
	public static int NORMALIZED_MAX_DISTANCE = 30;

	//rule
	public static int SMF_RULE_NUMBER = 3;
	public static int PZN_RULE_NUMBER = 3;



	// RBF
	public static int RBF_DEFAULT_DIMENSION = 3;

	// Genetic

	public static String GENETIC_DEFAULT_CROSSOVER_PROBABILITY = "0.6";
	public static String GENETIC_DEFAULT_MUTATION_PROBABILITY = "0.7";
	public static String GENETIC_DEFAULT_POPULATION_COUNT = "500";
	public static String GENETIC_DEFAULT_ITERATION_COUNT = "50";
	//DNA

	public static int DNA_MAX_WEIGHT = 40;
	public static int DNA_MIN_WEIGHT = -40;

	public static int DNA_MAX_DISTANCES = 30;
	public static int DNA_MIN_DISTANCES = 0;
	public static int DNA_MAX_SIGMA = 10;
	public static int DNA_MIN_SIGMA = 0;

	public static int DNA_MAX_THETA = 1;
	public static int DNA_MIN_THETA = 0;

	public static double DNA_NEW_PERCENT = 0.2;
	public static double DNA_FIRST_PERCENT = 0.3;
	public static double DNA_SECOND_PERCENT = 0.3;

	public static double DNA_RESERVE_PERCENT = 0.1;

}
