package ModelElements;

import Stuff.Angle3D;
import Stuff.Point3D;

import java.awt.*;

/**
 * Класс источника света
 */
public class Flash {
    public Point3D location;
    public Angle3D angle;
    public Color color;
    public float power;

    /**
     * Конструктор без параметров
     */
    public Flash() {
    }

    /**
     * Метод поворота источника света
     * @param angle угол поворота
     */
    public void rotate(Angle3D angle){}

    /**
     * Метод движения источника света
     * @param point точка для перемежения
     */
    public void move(Point3D point){}
}
