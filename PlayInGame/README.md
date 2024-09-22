# Play the Game

There are three games in this repository. You can play any of them. But only two of them available, because I'm too lazy to finish the third one. (2/3 games aare available)

## Features

## Features

- **Multiple Games**: Choose from three different games to play.
- **Interactive Console**: User-friendly console interface for game selection and interaction.
- **Dynamic Responses**: The program responds dynamically based on user input.
- **Extensible Architecture**: Abstract classes and methods allow for easy extension and customization of game logic.

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
         cd Java\PlayInGame\src
         ```
    - For macOS and Linux:
         ```sh
         cd Java/PlayInGame/src
         ```

#### Downloading the ZIP File

1. Download the ZIP file from the [GitHub repository](https://github.com/DanyilT/Java.git) and extract it.
2. Navigate to the project folder in the extracted directory (`Java/PlayInGame/src`).

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

- `src/`: Contains the source code.
    - `games/`: Contains the games.
        - `FirstGame.java`: The first game.
        - `SecondGame.java`: The second game.
        - `ThirdGame.java`: The third game.
    - `process/`: Contains the classes to process the games.
        - `Find.java`: Find the number of the game.
        - `NumOfGame.java`: Get the number of the game.
        - `Hello.java`: Say hello to the user.
        - `Process.java`: Process the user's input.
        - `StartGame.java`: Start the game.
    - `Main.java`: The main file to run the program.
- `README.md`: You are reading it right now.
