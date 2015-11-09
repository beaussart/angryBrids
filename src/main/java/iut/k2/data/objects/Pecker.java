package iut.k2.data.objects;

import iut.k2.physics.Coordinate2D;

import java.awt.*;

public class Pecker extends Entity {

	double positionBec;
	Coordinate2D vector;

	public Pecker(Coordinate2D c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Getter for property 'positionBec'.
	 *
	 * @return Value for property 'positionBec'.
	 */
	public double getPositionBec() {
		return positionBec;
	}

	@Override
	public void render(Graphics batch) {

	}

	@Override
	public void update(float deltaTime) {

	}
	
	public void update(double t){
		updatePosition(t);
	}


	public void updatePosition(double t) {
		c = new Coordinate2D(t, Math.pow(t, 2));
	}
	
 
}


