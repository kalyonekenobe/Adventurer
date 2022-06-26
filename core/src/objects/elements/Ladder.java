package objects.elements;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Intersector;
import com.badlogic.gdx.math.Polygon;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import helper.BodyHelper;

import java.awt.*;

public class Ladder extends GameMapObject {

    public Ladder(Vector2 position, Dimension dimension) {
        this.position = position;
        this.dimension = dimension;
    }

    @Override
    public void setBody(Body body) {
        body.getFixtureList().get(0).setSensor(true);
        super.setBody(body);
    }

    @Override
    public void render(SpriteBatch batch) { }
}
