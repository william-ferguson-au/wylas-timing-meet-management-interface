/*
 * Copyright (c) Xandar IP 2013.
 *
 * All Rights Reserved
 * No part of this application may be reproduced, copied, modified or adapted, without the prior written consent
 * of the author, unless otherwise indicated for stand-alone materials.
 *
 * Contact support@xandar.com.au for copyright requests.
 */

package au.com.xandar.meetmanager;

import java.util.List;

/**
 * Provides two way access to the MeetManager data necessary to manage the timing of a meet.
 *
 * @since version 10
 */
@SuppressWarnings("unused")
public interface ServiceAPI extends ServiceInfrastructure {

    /**
     * @return List of Meets currently accessible via this MeetManagementService.
     * <p>
     * <ul>
     *  <li>The RESTful implementation uses the GET request : <strong>/meets</strong></li>
     * </ul>
     *
     * @since  version 2
     */
    List<Meet> getMeets();

    /**
     * Return the List of all seeded Races for the Meet.
     * <p>
     * <ul>
     *  <li>The RESTful implementation uses the GET request : <strong>/meet/{meetId}/races</strong></li>
     * </ul>
     *
     * @param meetId        Id of the Meet for which to retrieves races.
     * @return List of all seeded Races for the Meet.
     *
     * @since  version 2
     */
    List<Race> getRaces(String meetId);

    /**
     * Returns the List of RaceEntry for the supplied Race.
     * <p>
     * <ul>
     *  <li>The RESTful implementation uses the GET request : <strong>/meet/{meetId}/{raceId}/raceEntries</strong></li>
     * </ul>
     *
     * @param meetId            Id of the Meet for which to retrieve entries.
     * @param raceId            Id of the Race for which to retrieve entries.
     * @return List of RaceEntry for the supplied Race.
     *
     * @since  version 2
     */
    List<RaceEntry> getRaceEntries(String meetId, String raceId);

    /**
     * Updates the Race with the RaceEntry results and marks it as completed.
     * <p>
     * <ul>
     *  <li>The RESTful implementation uses the POST request : <strong>/meet/{meetId}/{raceId}/raceEntries</strong> with the List of RaceEntry as content</li>
     * </ul>
     *
     * @param meetId            Id of the Meet to update.
     * @param raceId            Id of the Race to update.
     * @param entries           List of RaceEntry to set as the Race results.
     *
     * @since  version 2
     */
    void updateRaceEntries(String meetId, String raceId, List<RaceEntry> entries);

    /**
     * Notifies the meet manager that the state of the race has changed.
     * <p>
     * The most relevant of these from a meet management perspective is probably the change to {@link RaceState#RaceOver}.
     * </p>
     * <p>
     * <ul>
     *  <li>The RESTful implementation uses the POST request : <strong>/meet/{meetId}/{raceId}/raceStateChanged</strong> with the RaceState as content</li>
     * </ul>
     *
     * @param meetId            Id of the Meet to notify.
     * @param raceId            Id of the Race to notify.
     * @param state new state for the Race.
     *
     * @since  version 2
     */
    void raceStateChanged(String meetId, String raceId, RaceState state);

    /**
     * Returns the List of all disqualification codes that are valid for the given race.
     * <p>
     * <ul>
     *  <li>The RESTful implementation uses the GET request : <strong>/meet/{meetId}/{raceId}/dqItems</strong></li>
     * </ul>
     *
     * @param meetId            Id of the Meet for which to retrieve DQItems.
     * @param raceId            Id of the Race for which to retrieve DQItems.
     * @return List of DQItems that are valid for the given race.
     *
     * @since  version 2
     */
    List<DQItem> getDQItems(String meetId, String raceId);
}
