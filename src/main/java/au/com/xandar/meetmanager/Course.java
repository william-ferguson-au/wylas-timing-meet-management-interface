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
    LongCourseYards,

    /**
     * 25 yards.
     */
    ShortCourseYards;

    public int getDistance() {
        switch (this) {
            case LongCourse:
            case LongCourseYards: return 50;
            case ShortCourse:
            case ShortCourseYards: return 25;
        }
        throw new IllegalStateException("Unknown Course : " + this);
    }
}
