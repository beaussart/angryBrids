package iut.k2.data.objects;

import iut.k2.data.objects.Shapes.Circle;
import iut.k2.data.objects.Shapes.Rectangle2D;
import iut.k2.data.objects.Shapes.Shape;
import iut.k2.physics.Coordinate2D;
import iut.k2.util.Tools;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public abstract class Obstacle extends Entity implements ShapeBased{
    private final static int SIZE = 25;
    private final Coordinate2D renderTo;
    private final Map<Shape, Color> shapes;
    private Color col = Color.BLUE;
    private boolean isCollision = false;

    /**
     * Instantiate an obstacle with a color and add it to the map of shapes
     * to be displayed in the view
     */
	public Obstacle(Coordinate2D c) {
		super(c);
        renderTo = Tools.getSwingCords(c);
        shapes = new HashMap<>();
        }

	/**
	 * Return the map of shapes of this object
	 *
	 * @return shapes
	 */
	@Override
	public Map<Shape, Color> getDrawsShapes() {
		return shapes;
	}

	 /**
     * Change the color of the obstacle
     *
     * @param color
     */
    @Override
    public void setColor(Color color) {
        col = color;
    }

	@Override
	public void update(float deltaTime) {

	}

	/* (non-Javadoc)
	 * @see iut.k2.data.objects.Entity#onCollide(iut.k2.data.objects.Entity)
	 */
	@Override
	protected void onCollide(Entity e) {
		// TODO Auto-generated method stub
		
	}

	public boolean isCollision() {
		return isCollision;
	}

	public void setCollision(boolean isCollision) {
		this.isCollision = isCollision;
	}
}
