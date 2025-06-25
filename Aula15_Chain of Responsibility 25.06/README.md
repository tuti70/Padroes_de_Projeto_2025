## 📋 Validações Implementadas

1. ☑ Login cadastrado (`admin`, `user`, `guest`)
2. ☑ Senha contém letra maiúscula
3. ☑ Senha contém letra minúscula
4. ☑ Senha contém caractere especial (`@#$%&*`)
5. ☑ Senha contém número
6. ☑ Senha não tem 3 números consecutivos
7. ☑ Senha tem 8+ caracteres
8. ☑ Senha tem no máximo 16 caracteres

---

## 🧪 Exemplos de Teste

| Login    | Senha         | Resultado          |
| -------- | ------------- | ------------------ |
| `admin`  | `Senh@124`    | ✅ Válido          |
| `hacker` | `P@ssword123` | ❌ Login inválido  |
| `user`   | `senh@1234`   | ❌ Falta maiúscula |
| `guest`  | `Abc@45678`   | ❌ Sequência (456) |
| `admin`  | `A@1`         | ❌ Muito curta     |
| `user`   | `Senha1234`   | ❌ Falta especial  |

<details>
<summary>🔍 Legenda dos símbolos</summary>

- ✅ = Validação aprovada
- ❌ = Erro na validação
- ☑ = Regra implementada
</details>
