# 🛠️ Proyecto: Sistema de Gestión de Mantenimiento

Este proyecto es una aplicación Java local desarrollada para registrar, consultar y visualizar el historial de mantenimientos preventivos y correctivos de maquinaria en una planta de producción (caso aplicado: L’Oréal México).

---

## 📌 Funcionalidades

- Registro de mantenimientos (máquina, tipo, descripción, fecha)
- Consulta del historial de mantenimientos
- Edición y visualización en consola (versión inicial)
- Interfaz simple en consola para uso técnico

---

## 🧰 Tecnologías utilizadas

- Java 8+
- IntelliJ IDEA
- Git y GitHub para control de versiones

---

## 🚀 Cómo ejecutar

1. Clonar el repositorio:
   ```bash
   git clone https://github.com/Jose026-byte/FaseIII.git

   # 🛠️ Sistema de Gestión de Mantenimiento

## 🧾 Descripción

Aplicación local desarrollada en Java para registrar, consultar y visualizar mantenimientos preventivos y correctivos en maquinaria industrial. La solución responde a la necesidad de una herramienta accesible y sencilla para técnicos que no cuentan con una base de datos o sistema centralizado.

---

## 🚨 Problema identificado

En muchas áreas de producción, el seguimiento de mantenimientos se realiza en papel o en hojas de cálculo, lo cual limita la trazabilidad, análisis y seguridad de la información técnica.

---

## 💡 Solución

Una aplicación de escritorio, desarrollada en Java SE, que permite registrar cada mantenimiento con detalles como máquina, tipo, descripción y fecha, generando un historial útil para análisis de fallas.

---

## 🏗️ Arquitectura

```
Usuario → Menú en consola (IntelliJ) → Lógica Java (RegistroMantenimientos.java)
                                      → Entidad de datos (Mantenimiento.java)
                                      → Historial almacenado en memoria (ArrayList)
```

---

## 🗂️ Tabla de contenidos

- [Requerimientos](#requerimientos)
- [Instalación](#instalación)
- [Configuración](#configuración)
- [Uso](#uso)
- [Contribución](#contribución)
- [Roadmap](#roadmap)

---

## 📋 Requerimientos

- Java 8+
- IntelliJ IDEA (o cualquier IDE con soporte para Java)
- Git
- No se requiere conexión a internet ni base de datos externa

---

## 🛠️ Instalación

1. Clonar el repositorio:
   ```bash
   git clone (https://github.com/Jose026-byte/FaseIII.git)
   ```

2. Abrir el proyecto en IntelliJ IDEA

3. Ejecutar la clase `Main.java`

---

## ⚙️ Configuración

- No se requiere configuración avanzada.
- El proyecto funciona como aplicación de consola.
- Archivos fuente dentro de `src/com/mantenimiento/`.

---

## 📘 Uso

### Usuario final

- Ejecutar `Main.java`
- Menú interactivo con opciones para registrar mantenimientos y ver historial

### Usuario administrador

- Puede modificar la lógica del programa desde `RegistroMantenimientos.java`
- Se recomienda clonar y trabajar en ramas para mantenimiento

---

## 👥 Contribución

1. Clona el repositorio:
   ```bash
   git clone https://github.com/Jose026-byte/FaseIII.git
   ```

2. Crea una nueva rama:
   ```bash
   git checkout -b feature/nueva-funcionalidad
   ```

3. Haz tus cambios y súbelos:
   ```bash
   git add .
   git commit -m "Agrega nueva funcionalidad"
   git push origin feature/nueva-funcionalidad
   ```

4. Envía un Pull Request hacia la rama `develop`

---

## 🔭 Roadmap

- [ ] Exportar historial en PDF
- [ ] Agregar interfaz gráfica (Swing o JavaFX)
- [ ] Guardar información en archivo CSV o base de datos local
- [ ] Integración web para consulta remota


   
