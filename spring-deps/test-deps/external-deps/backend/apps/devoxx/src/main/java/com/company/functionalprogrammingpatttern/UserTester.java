package com.company.functionalprogrammingpatttern;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class UserTester {
    public static void main(String[] args) {
        UserTester obj = new UserTester();
        obj.getAllUsers1().forEach(System.out::println);
        System.out.println();
        obj.getAllUsers2().forEach(System.out::println);
        System.out.println();
        obj.getAllUsers3().forEach(System.out::println);
    }


    private List<UserDto> getAllUsers1() {
        List<User> users = getUsers();
        List<UserDto> usersDto = new LinkedList<>();
        for (User user : users) {
            UserDto dto = new UserDto();
            dto.setUsername(user.getUsername());
            dto.setFullName(user.getFirstName() + " " + user.getLastName());
            dto.setActive(Boolean.TRUE);
            usersDto.add(dto);
        }
        return usersDto;
    }


    private List<UserDto> getAllUsers2() {
        return getUsers().stream()
                .map(user -> {
                    UserDto dto = new UserDto();
                    dto.setUsername(user.getUsername());
                    dto.setFullName(user.getFirstName() + " " + user.getLastName());
                    dto.setActive(Boolean.TRUE);
                    return dto;
                }).collect(Collectors.toList());
    }

    private List<UserDto> getAllUsers3() {
        return getUsers().stream().map(this::toUserDto).collect(Collectors.toList());
    }

    private UserDto toUserDto(User user) {
        UserDto dto = new UserDto();
        dto.setUsername(user.getUsername());
        dto.setFullName(user.getFirstName() + " " + user.getLastName());
        dto.setActive(Boolean.TRUE);
        return dto;
    }

    private List<User> getUsers() {
        User sachin = new User("MasterBlaster", "Sachin", "Tendulkar");
        User anil = new User("Jumbo", "Anil", "Kumble");
        List<User> users = new LinkedList<>();
        users.add(sachin);
        users.add(anil);
        return users;
    }

}
