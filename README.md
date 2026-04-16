# 🏦 Bank Simulator (Java – OOP Based)

## 📌 Overview

The **Bank Simulator** is a console-based Java application designed using core Object-Oriented Programming (OOP) principles. It simulates real-world banking operations such as account creation, deposit, withdrawal, and balance management.

The project demonstrates concepts like **Abstraction, Inheritance, Polymorphism, and Encapsulation** through a structured and scalable design.

---

## 🚀 Features

* 🆕 Create Bank Accounts (Savings / Current)
* 💰 Deposit Money
* 💸 Withdraw Money
* 📊 Check Account Balance
* 🧾 Display All Accounts
* 🔐 Encapsulated Data Handling
* ⚙️ Polymorphic Withdrawal Behavior

---

## 🧠 OOP Concepts Used

* **Abstraction** → Abstract `Account` class
* **Inheritance** → `SavingsAccount` and `CurrentAccount` extend `Account`
* **Polymorphism** → Different `withdraw()` logic for each account type
* **Encapsulation** → Private fields with controlled access via getters

---

## 🧱 Project Structure

```id="3pkqxm"
├── Account.java          (Abstract base class)
├── SavingsAccount.java   (Maintains minimum balance)
├── CurrentAccount.java   (Supports overdraft limit)
├── Bank.java             (Manages all accounts)
├── MainApp.java          (User interface and menu system)
```

---

## ⚙️ Functional Logic

### 🏦 Account Types

* **SavingsAccount**

  * Maintains minimum balance
  * Prevents withdrawal below limit

* **CurrentAccount**

  * Allows overdraft up to a limit
  * Supports flexible withdrawals

---

### 🔄 Workflow

```id="x1p3ha"
User → MainApp → Bank → Account → (Savings / Current)
```

---

## ▶️ How to Run

1. Clone the repository

```id="9td6sy"
git clone https://github.com/your-username/Bank-Simulator.git
```

2. Open project in IntelliJ / Eclipse

3. Run:

```id="1c62jg"
MainApp.java
```

---

## 📸 Sample Output

```id="hy3ep6"
===== Bank Simulator =====
1. Create Account
2. Deposit
3. Withdraw
4. Display Accounts
5. Exit
```

---

## 🎯 Future Enhancements

* 🔍 Search account by account number
* ❌ Delete account
* 🔐 User authentication (login system)
* 💾 File handling (save/load accounts)
* 🌐 GUI (JavaFX / Swing)

---

## 🙋‍♂️ Author

**Kolla Revanth**
B.Tech Student | Java Developer

---

## ⭐ Learning Outcome

This project helped in understanding:

* Real-world application of OOP concepts
* Designing scalable systems using Java
* Managing data using collections (ArrayList)
* Writing clean and modular code

---
