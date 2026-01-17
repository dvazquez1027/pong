package pro.davidvazquez.fxgl.pong;

import static com.almasb.fxgl.dsl.FXGL.getAppHeight;
import static com.almasb.fxgl.dsl.FXGL.getAppWidth;
import static com.almasb.fxgl.dsl.FXGL.getGameScene;
import static java.lang.Math.abs;
import static java.lang.Math.signum;

import com.almasb.fxgl.entity.component.Component;
import com.almasb.fxgl.physics.PhysicsComponent;

import javafx.geometry.Point2D;

public class BallComponent extends Component {
    private PhysicsComponent physics;

    @Override
    public void onUpdate(double tpf) {
        limitVelocity();
        checkOffscreen();
    }

    private void limitVelocity() {
        // don't move too slow in x direction
        if (abs(physics.getVelocityX()) < 5 * 60) {
            physics.setVelocityX(signum(physics.getVelocityX()) * 5 * 60);
        }

        // don't move too fast in y direction
        if (abs(physics.getVelocityY()) > 5 * 60 * 2) {
            physics.setVelocityY(signum(physics.getVelocityY()) * 5 * 60);
        }
    }

    // reset ball position if it goes offscreen
    private void checkOffscreen() {
        var viewPort = getGameScene().getViewport();
        var visArea = viewPort.getVisibleArea();

        if (getEntity().getBoundingBoxComponent().isOutside(visArea)) {
            physics.overwritePosition(new Point2D(getAppWidth() / 2, getAppHeight() / 2));
        }
    }
}
