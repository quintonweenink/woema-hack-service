package org.wyona.webapp.controllers;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import org.wyona.webapp.models.Client;

/**
 * 'Hello World' Controller 
 */
@RestController
@RequestMapping(value = "/api/client")
public class ClientController {

    private static final Logger logger = LogManager.getLogger("HelloWorldController");

    private List<Client> clientList = new ArrayList<Client>();

    /**
     *
     */

    ClientController() {
        Client client1 = new Client();
        client1.setId(1L);
        client1.setUsername("Woema");
        client1.setEmail("test@woema.com");
        client1.setTrust(25L);

        clientList.add(client1);

        Client client2 = new Client();
        client2.setId(1L);
        client2.setUsername("Woema");
        client2.setEmail("test@woema2.com");
        client2.setTrust(25L);

        clientList.add(client2);

        Client client3 = new Client();
        client3.setId(1L);
        client3.setUsername("Woema");
        client3.setEmail("test@woema3.com");
        client3.setTrust(25L);

        clientList.add(client3);

        Client client4 = new Client();
        client4.setId(1L);
        client4.setUsername("Woema");
        client4.setEmail("test@woema4.com");
        client4.setTrust(25L);

        clientList.add(client1);
    }

    @RequestMapping(value = "/email", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Client> getByEmail(@RequestParam(name = "email", required = true) String email) {
        logger.info("getByEmail");
        Client client = clientList.stream().filter(c -> c.getEmail().equals(email)).findFirst().get();
        return new ResponseEntity<>(client, HttpStatus.OK);
    }

    @RequestMapping(value = "/username", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Client> getByUsername(@RequestParam(name = "username", required = true) String username) {
        logger.info("getByUsername");
        Client client = clientList.stream().filter(c -> c.getEmail().equals(username)).findFirst().get();
        return new ResponseEntity<>(client, HttpStatus.OK);
    }

    @RequestMapping(value = "/id", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Client> getById(@RequestParam(name = "id", required = true) Long id) {
        logger.info("getById");
        Client client = clientList.stream().filter(c -> c.getId().equals(id)).findFirst().get();
        return new ResponseEntity<>(client, HttpStatus.OK);
    }

}
