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

import java.util.LinkedHashMap;
import java.util.List;

/**
 * Provides two way access to the MeetManager data necessary to manage the timing of a meet.
 *
 * Implementations of this interface will be loaded using {@link java.util.ServiceLoader}.
 * So they must include a META-INF/services/au.com.xandar.meetmanager.MeetManagerService file
 * containing the full qualified names of the implementations they support.
 *
 * @see <a href="http://docs.oracle.com/javase/6/docs/api/index.html?java/util/ServiceLoader.html">ServiceLoader</a>
 * @since version 2
 */
@SuppressWarnings("unused")
public interface MeetManagerService extends ServiceInfrastructure, ServiceAPI {

}
