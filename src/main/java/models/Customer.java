package models;

import annotation.ClassDocumentation;
import annotation.MethodDocumentation;

/**
 * This is a Customer class representing a customer entity.
 *
 * @ClassDocumentation "Entity class representing a customer."
 */
@ClassDocumentation("Entity class representing a customer.")
public class Customer {

    private String customerName;

    // Constructor and other fields/methods...

    /**
     * Gets the name of the customer.
     *
     * @MethodDocumentation "Returns the name of the customer."
     * @return The customer's name.
     */
    @MethodDocumentation("Returns the name of the customer.")
    public String getCustomerName() {
        return customerName;
    }

    // Other methods...
}
