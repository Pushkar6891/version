package com.company.mapper;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapCollectExample {
    public static void main(String[] args) {
        List<UserDto> users = getUsers().stream()
                .map((User user) -> new UserDto(user.getId(), user.getUserName(), user.getEmail()))
                .collect(Collectors.toList());
        users.forEach(System.out::println);

    }

    private static List<User> getUsers() {
        return Arrays.asList(
                new User(1L, "Pushkar", "Welcome@123", "pushkarchauhan91@gmail.com"),
                new User(2L, "Sachin", "!Qaz2wsx", "sachin@gmail.com"),
                new User(5L, "Pooja", "MyPassword@123", "pooja@gmail.com")
        );
    }
}
