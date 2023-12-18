package models;

import annotation.ClassDocumentation;
import annotation.MethodDocumentation;

/**
 * This is a User class representing a system user.
 *
 * @ClassDocumentation "This class represents a system user."
 */
@ClassDocumentation("This class represents a system user.")
public class User {

    private String username;

    // Constructor and other fields/methods...

    /**
     * Gets the username of the user.
     *
     * @MethodDocumentation "Returns the username of the user."
     * @return The username.
     */
    @MethodDocumentation("Returns the username of the user.")
    public String getUsername() {
        return username;
    }

    // Other methods...
}
