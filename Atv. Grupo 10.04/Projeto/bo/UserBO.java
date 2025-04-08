package bo;

import java.util.List;

import dao.UserDAO;
import model.User;

public class UserBO {
    private UserDAO userDAO;

    public UserBO() {
        this.userDAO = new UserDAO();
    }

    public void addUser(User user) throws Exception {
        validateUser(user);
        userDAO.create(user);
    }

    public User getUser(int id) {
        return userDAO.read(id);
    }

    public void updateUser(User user) throws Exception {
        validateUser(user);
        if (userDAO.read(user.getId()) == null) {
            throw new Exception("Usuário não encontrado");
        }
        userDAO.update(user);
    }

    public void deleteUser(int id) {
        userDAO.delete(id);
    }

    private void validateUser(User user) throws Exception {
        if (user.getName() == null || user.getName().trim().isEmpty()) {
            throw new Exception("Nome do usuário é obrigatório");
        }
        if (user.getEmail() == null || !user.getEmail().contains("@")) {
            throw new Exception("Email inválido");
        }
    }

    public List<User> getAllUsers() {
        return userDAO.readAll();
    }
}