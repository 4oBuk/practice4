package com.chornobuk.practice4.repositories;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.chornobuk.practice4.entities.User;

@Repository
public class UsersRepository {

    private final static List<User> users = new LinkedList<>();

    static {
        users.add(new User("Bill Brown", "billy.brown@email.com", "billyBrown"));
        users.add(new User("John White", "john.white@email.com", "johnWhite"));
        users.add(new User("Anna Shevchenko", "anna.shevchenko@email.com", "annaShevchenko"));
        users.add(new User("Ivan Silver", "ivan.silver@email.com", "ivanSilver"));
        users.add(new User("Lex Kind", "lex.kind@email.com", "lexKind"));
        users.add(new User("Sam Son", "sam.son@email.com", "samSon"));
        users.add(new User("Lee One", "lee.one@email.com", "leeOne"));
        users.add(new User("Ayanami Rei", "ayanami.rei@email.com", "ayanamiRei"));
        users.add(new User("Shinji Ikari", "shinji.ikari@email.com", "shinjiIkari"));

    }

    public User getByEmail(String email) {
        return users.stream()
                .filter(user -> user.getEmail().equals(email))
                .findAny().orElse(null);
    }

    public List<User> getAll() {
        return users;
    }
}
