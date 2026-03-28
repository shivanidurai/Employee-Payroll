# Employee-Payroll
# Employee Payroll System in Java

A command-line based Employee Payroll System built with Java to demonstrate core Object-Oriented Programming (OOP) concepts.

## 🚀 Features
- **Interactive Menu:** Add, view, and remove employees through an interactive console menu.
- **Multiple Employee Types:** Supports both Full-Time (monthly salary) and Part-Time (hourly rate * hours worked) employees.
- **Dynamic Calculation:** Automatically calculates total salaries based on employee type.

## 🧠 OOP Concepts Demonstrated

This project is specifically designed to illustrate the four main pillars of Object-Oriented Programming:

1. **Abstraction**
   - The `Employee.java` class is declared as `abstract`. You cannot instantiate a raw 'Employee' directly; you must create an instance of one of its subclasses.
   - It defines an abstract method `calculateSalary()` without implementing it, forcing subclasses to provide the logic.

2. **Encapsulation**
   - All employee fields (like `name`, `id`, `monthlySalary`, `hourlyRate`) are marked as `private`.
   - Data is controlled and accessed strictly through public `getter` and `setter` methods, protecting the object's internal state.

3. **Inheritance**
   - `FullTimeEmployee` and `PartTimeEmployee` both `extend` the base `Employee` class.
   - This allows them to inherit the common properties (`name` and `id`) and methods without having to rewrite code.

4. **Polymorphism**
   - Both subclasses override the `calculateSalary()` method.
   - The `PayrollSystem` can loop through a generic list of `Employee` objects and call `.calculateSalary()`. The Java runtime automatically determines which specific calculation to use depending on whether the employee is full-time or part-time.

## 🛠️ How to Run

**Prerequisites:** You will need the [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/) installed on your machine.

1. Open your terminal or command prompt and navigate to the project directory:
   ```bash
   cd "C:\Users\Pooja\Desktop\oop proj"
   ```

2. Compile all the Java files:
   ```bash
   javac *.java
   ```

3. Run the compiled application:
   ```bash
   java Main
   ```

## 📂 Project Structure
- `Employee.java`: Abstract base class.
- `FullTimeEmployee.java`: Subclass for full-time employees.
- `PartTimeEmployee.java`: Subclass for part-time employees.
- `PayrollSystem.java`: Manages the list of employees.
- `Main.java`: The interactive entry point for the application.
