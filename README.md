# Laboratorio 1 - Desarrollo de Software

## 📋 Descripción
Este repositorio contiene la solución completa del Laboratorio 1, que incluye ejercicios prácticos de programación en Java y conceptos fundamentales de control de versiones con Git.

## Estructura del Proyecto

```
lab1/
├── README.md
└── Laboratorio1/
    ├── reto1/
    │   └── reto1.java
    ├── reto2/
    │   └── CarreraParalela.java
    ├── reto3/
    │   └── reto3.java
    ├── reto4/
    │   └── reto4.java
    ├── reto5/
    │   └── reto5.java
    └── reto6/
        └── reto6.java
```

---

## PARTE 3 - Cuestionario

### 1. ¿Cuál es la diferencia entre `git merge` y `git rebase`?

- **`git merge`**: Une dos ramas creando un commit de merge, mantiene el historial tal cual ocurrió.

- **`git rebase`**: Reescribe el historial, moviendo commits de una rama encima de otra, dejando un historial más lineal.

**Merge** conserva la historia; **rebase** la reorganiza.

---

### 2. Si dos ramas modifican la misma línea de un archivo, ¿qué sucede al hacer merge?

Git genera un **conflicto**

Debes resolverlo manualmente, eligiendo qué versión de la línea conservar (o combinarlas).

---

### 3. ¿Cómo puedes ver gráficamente el historial de merges y ramas en consola?

```bash
git log --oneline --graph --all
```

Esto muestra ramas, merges y commits de forma visual

---

### 4. Explica la diferencia entre un commit y un push

- **Commit**: Guarda cambios localmente en tu repositorio.

- **Push**: Envía esos commits al repositorio remoto (GitHub).

**Commit** ≠ GitHub, **Push** = subir a GitHub.

---

### 5. ¿Para qué sirven `git stash` y `git stash pop`?

- **`git stash`**: Guarda cambios sin hacer commit (los esconde).

- **`git stash pop`**: Recupera esos cambios.

**Útil cuando** necesitas cambiar de rama rápido sin perder trabajo.

---

### 6. ¿Qué diferencia hay entre `HashMap` y `Hashtable`?

| Característica | HashMap | Hashtable |
|----------------|---------|-----------|
| **Sincronización** | No es sincronizado | Es sincronizado |
| **Rendimiento** | Más rápido | Más lento |
| **Valores null** | Permite null | No permite null |
| **Uso actual** | Recomendado hoy | Obsoleto |

---

### 7. ¿Qué ventajas tiene `Collectors.toMap()` frente a un bucle tradicional para llenar un mapa?

- Código más corto y legible
- Estilo funcional
- Menos errores
- Mejor integración con Streams

---

### 8. Si usas `List` con objetos y luego aplicas `stream().map()`, ¿qué tipo de operación estás haciendo?

Una **operación intermedia**

Transforma los elementos, pero no ejecuta el stream todavía.

---

### 9. ¿Qué hace el método `stream().filter()` y qué retorna?

- **Función**: Filtra elementos según una condición
- **Retorna**: Un `Stream` con los elementos que cumplen la condición

No devuelve una lista directamente.

---

### 10. Describe el paso a paso de cómo crear una rama desde develop si es una funcionalidad nueva

```bash
git checkout develop
git pull origin develop
git checkout -b feature/nueva-funcionalidad
```

Ahora trabajas en una rama nueva basada en `develop`.

---

### 11. ¿Cuál es la diferencia entre crear una rama con `git branch` y con `git checkout -b`?

- **`git branch nombre`**: Crea la rama, pero NO cambia a ella.

- **`git checkout -b nombre`**: Crea la rama Y cambia a ella automáticamente.

---

### 12. ¿Por qué es recomendable crear ramas `feature/` para nuevas funcionalidades en lugar de trabajar en `main` directamente?

- Evita romper producción
- Facilita pruebas
- Permite trabajo en equipo
- Historial más ordenado
- Mejores revisiones (pull requests)

---

## Autores

- **Roger Duran**
- **Camilo Leon**

## Fecha

Febrero 2026
