package com.alisonadamus.sewingmaterials.persistence.entity;

import com.alisonadamus.sewingmaterials.persistence.entityservise.HashingPassword;
import java.util.Objects;

/**
 * Клас, що представляє користувача системи.
 */
public class User extends Entity {

    /**
     * Логін користувача.
     */
    private String login;
    /**
     * Пароль користувача.
     */
    private final String password;
    /**
     * Адреса електронної пошти користувача.
     */
    private String email;
    /**
     * Статус адміністратора користувача.
     */
    private Boolean adminStatus;

    /**
     * Конструктор класу користувача.
     *
     * @param login    Логін користувача
     * @param password Пароль користувача
     * @param email    Електронної пошти користувача
     */
    public User(String login, String password, String email) {
        super();
        this.login = login;
        this.password = HashingPassword.getInstance().hashedPassword(password);
        this.email = email;
        this.adminStatus = false;
    }

    /**
     * Метод отримання унікального ідентифікатора {@link Entity#id}
     *
     * @return Унікальний ідентифікатор
     */
    public String getId() {
        return id;
    }

    /**
     * Метод отримання логіну користувача {@link User#login}
     *
     * @return Логін користувача
     */
    public String getLogin() {
        return login;
    }

    /**
     * Метод встановлення логіну користувача
     *
     * @param login Логін користувача
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Метод отримання паролю користувача {@link User#password}
     *
     * @return Пароль користувача
     */
    public String getPassword() {
        return password;
    }

    /**
     * Метод отримання електронної пошти {@link User#email}
     *
     * @return Електронна пошта користувача
     */
    public String getEmail() {
        return email;
    }

    /**
     * Метод отримання статусу адміністратора користувача {@link User#adminStatus}
     *
     * @return Статус адміністратора користувача
     */
    public Boolean getAdminStatus() {
        return adminStatus;
    }

    /**
     * Метод встановлення статусу адміністратора користувача
     *
     * @param adminStatus Статус адміністратора користувача
     */
    public void setAdminStatus(Boolean adminStatus) {
        this.adminStatus = adminStatus;
    }

    /**
     * Перевіряє рівність об'єктів користувача за логіном, паролем, електронною поштою та статусом
     * адміністратора.
     *
     * @param o Об'єкт для порівняння
     * @return true, якщо об'єкти рівні, інакше false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(login, user.login) && Objects.equals(password,
            user.password) && Objects.equals(email, user.email) && Objects.equals(
            adminStatus, user.adminStatus);
    }

    /**
     * Генерує хеш-код об'єкта на основі логіна, пароля, електронної пошти та статусу
     * адміністратора.
     *
     * @return Хеш-код об'єкта
     */
    @Override
    public int hashCode() {
        return Objects.hash(login, password, email, adminStatus);
    }
}