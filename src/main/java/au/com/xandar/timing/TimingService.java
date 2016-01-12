package au.com.xandar.timing;

import au.com.xandar.meetmanager.Race;
import au.com.xandar.meetmanager.RaceEntry;
import au.com.xandar.meetmanager.RaceState;

import java.util.List;

/**
 * Service implemented by Wylas Timing to listen to and respond to changes propagated by the Mett Manager.
 *
 * @see {https://wylas-timing.com}
 */
@SuppressWarnings("unused")
public interface TimingService {

    /**
     * Notification that any details of a Race have changed, including addition of a new Race.
     *
     * This would include change in stroke, distance, entries, state.
     *
     * <strong>
     * The RESTful method is /timingService/{meetId}/{raceId}/{lastChangedTime}/raceModified.
     *
     * Body: Race
     * </strong>
     *
     * @param meetId                Meet containing the Race that has changed.
     * @param race                  Race that has changed.
     * @param lastChangedTimeMillis Time at which the Race was last modified.
     */
    void onRaceModified(String meetId, String raceId, Race race, Long lastChangedTimeMillis);

    /**
     * Notification that the current Race has been deleted.
     *
     * <strong>
     * The RESTful method is /timingService/{meetId}/{raceId}/{lastChangedTime}/raceDeleted.
     * </strong>
     *
     * @param meetId                Meet containing the Race that has been deleted.
     * @param raceId                Race that has been deleted.
     * @param lastChangedTimeMillis Time at which the Race was deleted.
     */
    void onRaceDeleted(String meetId, String raceId, Long lastChangedTimeMillis);

    /**
     * Notification that any details of a Race have changed, including addition of a new Race.
     *
     * This would include change in stroke, distance, entries, state.
     *
     * <strong>
     * The RESTful method is /timingService/{meetId}/{raceId}/{lastChangedTime}/raceStateModified.
     *
     * Body: RaceState
     * </strong>
     *
     * @param meetId                Meet containing the Race that has changed.
     * @param raceId                Race that has changed.
     * @param state                 State to which the Race has changed.
     * @param lastChangedTimeMillis Time at which the Race was last modified.
     */
    void onRaceStateModified(String meetId, String raceId, RaceState state, Long lastChangedTimeMillis);

    /**
     *
     * <strong>
     * The RESTful method is /timingService/{meetId}/{raceId}/{lastChangedTime}/raceEntriesModified.
     *
     * Body: List of RaceEntry
     * </strong>
     *
     * @param meetId                Meet containing the Race whose entries have changed.
     * @param raceId                Race whose entries were modified.
     * @param entries               RaceEntries after modification.
     * @param lastChangedTimeMillis Time at which the Race/RaceEntries were last modified.
     */
    void onRaceEntriesModified(String meetId, String raceId, List<RaceEntry> entries, Long lastChangedTimeMillis);
}
