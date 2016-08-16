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

/**
 * Represents a disqualification code, that is a reason for disqualifying a competitor.
 */
@SuppressWarnings("unused")
public final class DQItem {

    /**
     * @since  version 1
     */
    public String id;

    /**
     * @since  version 1
     */
    public String displayCode;

    /**
     * @since  version 1
     */
    public String description;

    public DQItem() {
        // For reflective construction.
    }

    public DQItem(String id, String description) {
        this.id = id;
        this.displayCode = id;
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DQItem)) {
            return false;
        }

        DQItem dqItem = (DQItem) o;

        if (!id.equals(dqItem.id)) {
            return false;
        }
        if (!displayCode.equals(dqItem.displayCode)) {
            return false;
        }
        return description.equals(dqItem.description);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + displayCode.hashCode();
        result = 31 * result + description.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "DQItem{" +
            "id='" + id + '\'' +
            ", displayCode='" + displayCode + '\'' +
            ", description='" + description + '\'' +
            '}';
    }
}
