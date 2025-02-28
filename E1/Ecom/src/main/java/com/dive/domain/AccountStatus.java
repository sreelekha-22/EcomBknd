package com.dive.model;

public enum AccountStatus {

    PENDING_VERIFICATION, // Account is created but not yet verified by the admin
    ACTIVE,               // Account is active and in good standing
    SUSPENDED,            // Account is temporarily suspended, possibly due to violations
    DEACTIVATED,          // Account is deactivated, user may have chosen to deactivate it
    BANNED,                // ACCount is permanently nbanned due to severe violations
    CLOSED                  // ACCount is permanently closed, possibly at user request
}
