# Coffee Shop Program
> [!IMPORTANT]
> The project was created as a final project for Programming course module (Year 1, Sem 2), and I remove it from this folder.  
> It is currently storing at [DanyilT/projects-in-university/tree/project/year01/module-fundamentals_of_programming_2/coffee_shop](https://github.com/DanyilT/projects-in-university/tree/project/year01/module-fundamentals_of_programming_2/coffee_shop)

This is a Java-based Coffee Shop program that allows users to place orders, make payments, and manage inventory through an admin panel. The program is run in the console and provides a simple interface for users to interact with.

## Features

- Place orders for available menu items
- Choose payment methods (Cash or Card)
- Admin panel for inventory management (view, add, remove items)

## Requirements

- Java 8 or higher (I can't remember what java I used, I think it was 21)

### Installation

Just Google it, if you don't know how to install Java. Ask ChatGpt for any help.

#### Windows / macOS

1. Download and Install Java from the [official Java website](https://www.oracle.com/java/technologies/javase-downloads.html).
2. I think, I don't need to tell you what to do next.
3. Install Java via the installer. Just Double-click the downloaded `.exe` or `.dmg` file and follow the instructions to install Java.
4. You can verify the installation by running `java -version` in Command Prompt.

#### Linux

- If you are using a Linux, I think you already know what to do. You don't need my help.

## Usage

### Clone the Repository

#### Using Git

1. Clone the repository:
    ```sh
    git clone https://github.com/DanyilT/Java.git
    ```

2. Navigate to the project folder:
    - For Windows:
         ```sh
         cd Java\CoffeeShop\src
         ```
    - For macOS and Linux:
         ```sh
         cd Java/CoffeeShop/src
         ```

#### Downloading the ZIP File

1. Download the ZIP file from the [GitHub repository](https://github.com/DanyilT/Java.git) and extract it.
2. Navigate to the project folder in the extracted directory (`Java/CoffeeShop/src`).

### Run the Program

1. Compile the program:
    ```sh
    javac Main.java
    ```

2. Run the program:
    ```sh
    java Main
    ```

## File Structure

- `data/..`: Contains the data files for the program.
- `src/`: Contains the source code files.
    - `InventoryManager.java`: Contains the inventory management logic.
    - `TransactionManager.java`: Contains the transaction logic.
    - `Transaction.java`: Contains some transaction logic.
    - `MenuItems.java`: Do something with menu items.
    - `Main.java`: Main program file.
- `README.md`: You are reading it right now.
