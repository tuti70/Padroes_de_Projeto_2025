package dao;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import model.User;

public class UserDAO {
    private static final String FILE_NAME = "C:\\my_apps\\Padroes_de_Projeto_2025\\Atv. Grupo 10.04\\Projeto\\database\\users.dat";

    public UserDAO() {
        System.out.println("Caminho do arquivo: " + new File(FILE_NAME).getAbsolutePath());
    }

    

    public synchronized void create(User user) {
        List<User> users = readAll();
        users.add(user);
        writeAll(users);
    }

    public User read(int id) {
        return readAll().stream()
                .filter(u -> u.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public synchronized List<User> readAll()  {
        File file = new File(FILE_NAME);

        // Se o arquivo não existe, retorna lista vazia
        if (!file.exists() || file.length() == 0) {
            return new ArrayList<>();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (List<User>) ois.readObject();
        } catch (EOFException e) {
            // Arquivo vazio
            return new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erro ao ler arquivo: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    public void update(User updatedUser) {
        List<User> users = readAll();
        users.replaceAll(u -> u.getId() == updatedUser.getId() ? updatedUser : u);
        writeAll(users);
    }

    public void delete(int id) {
        List<User> users = readAll();
        users.removeIf(u -> u.getId() == id);
        writeAll(users);
    }

    private void writeAll(List<User> users) {
        System.out.println("Salvando " + users.size() + " usuários...");
        try {
            File file = new File(FILE_NAME);
            if (!file.exists()) {
                file.createNewFile();
            }

            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
                oos.writeObject(users);
                System.out.println("Salvo com sucesso!");
            }
        } catch (Exception e) {
            System.err.println("Falha ao salvar: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void printAllUsers() {
        List<User> users = readAll();
        users.forEach(user -> 
            System.out.println("ID: " + user.getId() + " | Nome: " + user.getName()));
    }
}