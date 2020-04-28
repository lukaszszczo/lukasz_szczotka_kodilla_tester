package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {
    private String principalFirstName;
    private String principalLastName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return Objects.equals(principalFirstName, principal.principalFirstName) &&
                Objects.equals(principalLastName, principal.principalLastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(principalFirstName, principalLastName);
    }

    public String getPrincipalFirstName() {
        return principalFirstName;
    }

    public String getPrincipalLastName() {
        return principalLastName;
    }

    public Principal(String principalFirstName, String principalLastName) {
        this.principalFirstName = principalFirstName;
        this.principalLastName = principalLastName;
    }

}
