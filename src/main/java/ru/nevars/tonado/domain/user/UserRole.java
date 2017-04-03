package ru.nevars.tonado.domain.user;

/**
 * An enum represents a list of roles which a user must have. Each user exactly an one role.
 */
public enum UserRole {

    GUEST("Гость"),
    BASE_USER("Пользователь"),
    PREMIUM_USER("Премиум пользователь"),
    ADMIN("Администратор"),
    SUPERADMIN("Главный администратор");

    UserRole(String roleType) {
        this.roleType = roleType;
    }

    private String roleType;

    @Override
    public String toString() {
        return roleType;
    }
}
