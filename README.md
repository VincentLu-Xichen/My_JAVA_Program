# Java 程序练习（快速指南）

简洁说明：本目录下为若干独立的 Java 小练习，无包名，直接用 `javac`/`java` 编译运行。

## 环境
- JDK 8+；任意终端或 IDE（VSCode / Trae AI）。

## 用法
- 通用：`javac ClassA.java [ClassB.java ...]`，然后 `java ClassA`。
- 常用示例：
  - 计数器：`javac Counter.java BoundedCounter.java && java BoundedCounter`
  - 时钟/闹钟：`javac Clock.java AlarmClock.java && java AlarmClock`
  - 圆形测试：`javac Circle.java CircleTestSuite.java && java CircleTestSuite`

## 约定
- 文件名与 `public class` 名一致，使用 PascalCase。
- 构造器第一条语句必须是 `super(...)` 或 `this(...)`（只能出现一次）。
- 私有字段通过 getter 访问；字符串没有 `\s` 转义，空格写成 `" "`。

## 排错提示
- 先 `javac`，再 `java`；根据报错检查：文件名/类名大小写、构造器调用位置、访问修饰符、字符串字面量。