package com.banco.dtos;

import com.banco.domain.user.UserType;

import java.math.BigDecimal;

public record UserDto(String firstName, String lastName, String document, BigDecimal balance, String email, String password, UserType userType) {
}
