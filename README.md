# XJTLU ICS 程序练习（2024）

本仓库包含多组 Java 练习，涵盖面向对象、继承与封装、基本算法、字符串与数学计算等主题。文件均位于同一目录，未使用包名，便于 `javac`/`java` 直接编译运行。

## 环境要求
- JDK 8+（macOS/Linux/Windows 均可）
- 终端或 IDE（VSCode / Trae AI 均可）

## 快速开始
在项目根目录运行：
```bash
# 编译并运行示例（计数器）
javac Counter.java BoundedCounter.java
java BoundedCounter

# 时钟与闹钟
javac Clock.java AlarmClock.java
java AlarmClock

# 万圣钟
javac HalloweenClock.java
java HalloweenClock

# 圆形与测试
javac Circle.java CircleTestSuite.java
java CircleTestSuite
```

## 主要练习与说明
- Counter / BoundedCounter
  - 演示构造器重载、边界值处理与 `super(...)` 调用规则。
  - 构造函数首条语句必须是 `super(...)` 或 `this(...)`；参数可用 `Math.min(...)` 或三元表达式做“就地计算”。

- Clock / AlarmClock / CuckooClock / HalloweenClock
  - 继承与方法覆盖（`tick()`/`toString()`），以及封装（私有字段通过 `getHours()`/`getMinutes()` 访问）。
  - `Clock.toString()` 已实现小时/分钟的零填充（例如 `07:05`）。
  - `AlarmClock.tick()` 使用 `super.tick()` 先推进时间，再比较闹钟时间。
  - `HalloweenClock` 使用静态计数器示范跨实例累计行为。

- Circle / RightTriangle / Temperature
  - 基本几何与温度转换练习。

- Person / PersonTest
  - 面向对象基础与简单测试。

- 其它练习
  - `sum.java`, `pn.java`, `harmonic_number.java`, `greatcircle.java` 等。

## 常见问题
- 构造器首条语句必须为 `super(...)` 或 `this(...)`，且只能出现一次。
- 子类不能直接访问父类的私有字段，需通过公开的 `getter`。
- Java 字符串无 `\s` 转义，空格请直接写 `" "`。
- 未使用包名，运行时用类名：`java ClassName`。

## 建议
- 修改代码后先 `javac` 再 `java` 运行验证。
- 若有报错，优先检查构造器调用位置、访问修饰符与字符串字面量。