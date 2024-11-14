plugins {
    `java-library`
}

group = "me.matsubara"
version = "3.3.3.5"
description = "Forget about those boring villagers and replace them with interactive humans!"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(16))
    }
}

allprojects {
    apply(plugin = "java")

    repositories {
        mavenCentral()
    }

    dependencies {
        // Annotations
        compileOnly("org.jetbrains:annotations:24.0.1")
        // Lombok
        compileOnly("org.projectlombok:lombok:1.18.30")
    }

    tasks.withType<JavaCompile> {
        options.encoding = "UTF-8"
    }
}

// 子模块设置
subprojects {
    apply(plugin = "java")

    // 继承父项目的依赖配置
    dependencies {
        compileOnly("org.jetbrains:annotations:24.0.1")
        compileOnly("org.projectlombok:lombok:1.18.30")
    }
}
