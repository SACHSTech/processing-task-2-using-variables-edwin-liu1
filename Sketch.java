import processing.core.PApplet;

public class Sketch extends PApplet {
	
	int intScreenSize;

  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(800, 600);
    
  if (width >= height)
    {
      intScreenSize = height;
    }
    else
    {
      intScreenSize = width;
    }
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(164, 182, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    // pedals
    fill(255);
    ellipse( (width / 2), (height / 2) - (intScreenSize / 7), (intScreenSize) / 5, (intScreenSize) / 4);
    ellipse( (width / 2), (height / 2) + (intScreenSize / 7), (intScreenSize) / 5,(intScreenSize) / 4);
    ellipse( (width / 2) + (intScreenSize / 7), (height / 2), (intScreenSize) / 4, (intScreenSize) / 5);
    ellipse( (width / 2) - (intScreenSize / 7), (height / 2), (intScreenSize) / 4, (intScreenSize) / 5);

    fill(180);
    ellipse( (width / 2), (height / 2) - (intScreenSize / 9), (intScreenSize) / 7, (intScreenSize) / 6);
    ellipse( (width / 2), (height / 2) + (intScreenSize / 9), (intScreenSize) / 7,(intScreenSize) / 6);
    ellipse( (width / 2) + (intScreenSize / 9), (height / 2), (intScreenSize) / 6, (intScreenSize) / 7);
    ellipse( (width / 2) - (intScreenSize / 9), (height / 2), (intScreenSize) / 6, (intScreenSize) / 7);

    //the center thing
    fill(255, 255, 0);
	  ellipse( (width / 2), (height / 2), (intScreenSize) / 6, (intScreenSize) / 6 );
  }
  
  // define other methods down here.
}