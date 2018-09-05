package org.wyona.webapp.models;

/**
 *
 */
public class Client {

    private Long id;
    private String username;
    private String email;
    private Long trust;

    public String getGreeting() {
        return "Hello World";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTrust() {
        return trust;
    }

    public void setTrust(Long trust) {
        this.trust = trust;
    }
}
