package controller;

import bo.UserBO;
import model.User;

public class UserController {
    private UserBO userBO;
    private static int lastId = 0;

    public UserController() {
        this.userBO = new UserBO();
        this.lastId = findMaxId(); // Inicializa com o maior ID existente
    }

    private int generateNewId() {
        lastId++; // Incrementa o último ID
        return lastId;
    }

    private int findMaxId() {
        // Encontra o maior ID no banco de dados existente
        return userBO.getAllUsers().stream()
                .mapToInt(User::getId)
                .max()
                .orElse(0); // Retorna 0 se não houver usuários
    }

    public String addUser(String name, String email) {
        try {
            int newId = generateNewId(); // Usa o novo ID sequencial
            User user = new User(newId, name, email);
            userBO.addUser(user);
            return "Usuário adicionado com sucesso! ID: " + newId;
        } catch (Exception e) {
            return "Erro: " + e.getMessage();
        }
    }

    public String getUser(int id) {
        User user = userBO.getUser(id);
        if (user != null) {
            return user.toString();
        }
        return "Usuário não encontrado";
    }

    public String updateUser(int id, String name, String email) {
        try {
            User user = new User(id, name, email);
            userBO.updateUser(user);
            return "Usuário atualizado com sucesso!";
        } catch (Exception e) {
            return "Erro: " + e.getMessage();
        }
    }

    public String deleteUser(int id) {
        userBO.deleteUser(id);
        return "Usuário removido com sucesso!";
    }

}