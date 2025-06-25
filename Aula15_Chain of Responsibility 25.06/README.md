# 📋 Sistema de Validação de Login/Senha

## 🔍 Validações Implementadas

| #   | Regra de Validação                          | Exemplo Válido       | Exemplo Inválido           |
| --- | ------------------------------------------- | -------------------- | -------------------------- |
| 1   | Login cadastrado (`admin`, `user`, `guest`) | `admin`              | `hacker`                   |
| 2   | Senha contém letra maiúscula                | `A` em `Senh@1234`   | `senh@1234`                |
| 3   | Senha contém letra minúscula                | `s` em `Senh@1234`   | `SENH@1234`                |
| 4   | Senha contém caractere especial (`@#$%&*`)  | `@` em `Senh@1234`   | `Senha1234`                |
| 5   | Senha contém número                         | `1` em `Senh@1234`   | `Senh@abcd`                |
| 6   | Senha não tem 3 números consecutivos        | `Senh@1a2b3`         | `Senh@1234`                |
| 7   | Senha tem 8+ caracteres                     | `Senh@1234` (8)      | `A@1` (3)                  |
| 8   | Senha tem no máximo 16 caracteres           | `Senh@1234abcd` (12) | `Senh@1234abcdXYZ123` (17) |

---

## 🧪 Exemplos de Teste

### Casos de Sucesso ✅

```java
Login: admin | Senha:  Senh@1a2b3 → ☑ Válido
Login: user  | Senha: P@ssw0rd → ☑ Válido
```
