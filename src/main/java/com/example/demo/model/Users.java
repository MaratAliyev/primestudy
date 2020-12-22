package com.example.demo.model;

import lombok.*;
import javax.persistence.*;

    @Entity
    @Data

public class Users {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String login;
        private String password;

        public Users (String login, String password) {
            this.login = login;
            this.password = password;
        }
    }
