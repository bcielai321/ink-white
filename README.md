# flybrid

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Minecraft Version](https://img.shields.io/badge/Minecraft-1.20.1-blue.svg)](https://www.minecraft.net/)

---

## 简体中文 (Chinese)

### **项目简介**
这是一个基于 **Fabric API** 开发的 Minecraft 基础功能模组。本项目目前主要用于**个人学习、技术测试及基础功能演示**，旨在探索模组开发的底层逻辑与实现方式。

### **当前状态**
⚠️ **注意**：本模组目前处于早期测试/实验阶段（Experimental/Testing），仅建议用于开发环境测试，请勿直接用于重要的生存存档。
---

## 🛠️ 技术实现与原理 (Technical Implementation)

### **核心架构**
本项目严格遵循 Fabric 模块化开发规范：
- **注册系统**：采用统一的 `Registry` 类管理，通过 `ModItems` 和 `ModBlocks` 实现解耦。
- **材质加载**：基于 Minecraft 标准资源包路径结构 (`src/main/resources/assets/flybrid/...`)。
- **合成逻辑**：通过 Data Generation (数据生成) 自动生成 JSON 合成表，而非手动编写。

### **性能优化**
- **按需加载**：确保所有资源仅在对应阶段加载，减少内存占用。
- **代码规范**：使用 Java 17 特性（如 Record 类）优化数据结构。

---

## 📈 开发进度 (Development Roadmap)

- [x] **基础框架搭建** (Fabric API 接入)
- [x] **矿物系统** (原矿、矿物块及其材质实现)
- [x] **合成与燃料** (基础熔炼逻辑与燃烧时间配置)
- [ ] **自定义工具集** (计划中：添加对应的挖掘工具)
- [ ] **世界生成** (计划中：实现矿石在自然世界中的分布)

---

## 🚀 开发者指南 (For Developers)

如果你想本地研究本项目代码，请按照以下步骤操作：

1. **克隆仓库**：
   `git clone https://github.com/bcielai321/ink-white.git`
2. **导入 IDEA**：
   打开 IntelliJ IDEA，选择 `build.gradle` 作为项目导入。
3. **配置环境**：
   运行 Gradle 任务 `genSources` 以生成 Minecraft 源代码。
4. **启动游戏**：
   执行 `runClient` 任务即可进入测试环境。


### **相关链接**
- [官方文档 (Fabric)](https://docs.fabricmc.net/)
- [反馈问题 (Issues)](https://github.com/bcieal321/flybrid/issues)
- [更新日志 (Changelog)](./CHANGELOG.md)

### **开源协议**
本项目采用 [MIT License](./LICENSE) 授权。你可以自由学习、修改或集成代码，但请务必保留原始版权声明。

---

## English

### **Introduction**
A Minecraft base-feature mod developed using the **Fabric API**. This project is currently dedicated to **personal learning, technical testing, and prototyping**, aiming to explore the core mechanics of mod development.

### **Current Status**
⚠️ **Disclaimer**: This mod is currently in the **Testing/Experimental phase**. It is intended for development environments only—please do not use it in important survival worlds.

---

## 🛠️ Technical Implementation & Principles

### **Core Architecture**
This project strictly follows the Fabric modular development specifications:
- **Registry System**: Managed via a unified `Registry` class, achieving decoupling through `ModItems` and `ModBlocks`.
- **Asset Loading**: Based on the standard Minecraft resource pack path structure (`src/main/resources/assets/flybrid/...`).
- **Recipe Logic**: Leveraging **Data Generation** to automatically produce JSON recipe files instead of manual authoring.

### **Performance Optimization**
- **On-demand Loading**: Ensuring all resources are loaded only during the corresponding stages to minimize memory footprint.
- **Code Standards**: Utilizing Java 17 features (such as Record classes) to optimize data structures.

---

## 📈 Development Roadmap

- [x] **Core Framework Setup** (Fabric API integration)
- [x] **Mineral System** (Implementation of Raw Ores, Mineral Blocks, and their textures)
- [x] **Crafting & Smelting** (Basic recipe logic and fuel burn time configuration)
- [ ] **Custom Toolsets** (Planned: Adding corresponding mining tools)
- [ ] **World Generation** (Planned: Implementing ore distribution in the natural world)

---

## 🚀 For Developers

If you wish to explore or contribute to the source code, please follow these steps:

1. **Clone the Repository**:
   `git clone https://github.com/bcielai321/ink-white.git`
2. **Import into IDEA**:
   Open IntelliJ IDEA and select `build.gradle` to import the project.
3. **Configure Environment**:
   Run the Gradle task `genSources` to generate Minecraft source code.
4. **Launch the Game**:
   Execute the `runClient` task to enter the testing environment.

### **Quick Links**
- [Fabric Documentation](https://docs.fabricmc.net/)
- [Report Issues](https://github.com/bcieal321/flybrid/issues)
- [Changelog](./CHANGELOG.md)

### **License**
Licensed under the [MIT License](./LICENSE). You are free to learn from, modify, and incorporate this code into your own projects, provided that the original copyright notice is included.


