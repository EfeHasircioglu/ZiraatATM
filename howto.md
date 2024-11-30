**Objective:**

Create a basic banking application using Java with Object-Oriented Programming (OOP) concepts. This application will allow users to create accounts, deposit money, withdraw money, and check their balance.

Required Classes:

**Account:**

Attributes:
accountNumber (int)
accountHolderName (String)
balance (double)

Methods:
Constructor to initialize account number and account holder name.
deposit(double amount): Adds the specified amount to the balance.
withdraw(double amount): Subtracts the specified amount from the balance, ensuring sufficient funds.   
checkBalance(): Returns the current balance.

*ACCOUNT SINIFI BİTİRİLMİŞTİR*

**Bank:**

Attributes:
accounts (ArrayList<Account>)
Methods:
createAccount(String name): Creates a new account and adds it to the accounts list.
findAccount(int accountNumber): Searches for an account by its account number.
displayAllAccounts(): Prints details of all accounts.

--- 
Implementation Steps:

Create the Account Class:

Define the attributes and constructor.
Implement the deposit, withdraw, and checkBalance methods.
Create the Bank Class:

Define the accounts ArrayList to store Account objects.
Implement the createAccount, findAccount, and displayAllAccounts methods.
Main Class:

Create a Bank object.
Provide a menu-driven interface to allow users to:
Create a new account
Deposit money into an account
Withdraw money from an account
Check the balance of an account
Display all accounts