package au.com.xandar.meetmanager;

/**
 * Represents the size of the pool.
 *
 * @since version 14
 */
public enum Course {

    /**
     * 50 meters.
     */
    LongCourse,

    /**
     * 25 meters.
     */
    ShortCourse,

    /**
     * 50 yards.
     */
    Yards;

    public int getDistance() {
        switch (this) {
            case LongCourse: return 50;
            case ShortCourse: return 25;
            case Yards: return 50;
        }
        throw new IllegalStateException("Unknown Course : " + this);
    }
}
