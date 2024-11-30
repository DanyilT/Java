# Blackjack Game

## Overview
This project is a console-based Blackjack game implemented in Java. It includes various classes and packages to handle the game logic, player actions, card management, and data handling.

## Usage

To run the Blackjack game, write new `playerId` to `/data/game_data.yaml` file (don't forget about the Dealer (id for dealer is 0)) or leave it empty, will create one new player.

- Example:
    ```yaml
    players:
      0:
        name: "Dealer"
      1:
        name: "qwerty"
    ```

## Project Structure
The project is organized into the following packages:

- `cards`: Contains classes related to card management.
- `data`: Handles reading and writing game data.
- `exceptions`: Custom exceptions used in the game.
- `game`: Contains the main game logic and engine.
- `players`: Manages player actions and data.

## Packages and Classes

### `Main`
- **main()**: Entry point of the application, initializes the `BlackjackGame`.

### `cards`
- **Card**: Represents a single card with a rank and suit.
- **CardRank**: Enum for card ranks.
- **CardSuit**: Enum for card suits.
- **Deck**: Manages a deck of cards, including shuffling and drawing cards.

### `data`
- **DataHandler**: Abstract class for reading and writing data.
- **DeckDataHandler**: Handles deck-specific data operations.
- **GameDataHandler**: Manages player game data.

### `exceptions`
- **InsufficientChipsException**: Thrown when a player tries to bet more chips than they have.
- **InvalidPlayerDataException**: Thrown when player data is invalid.

### `game`
- **BlackjackGame**: Starts the game and initializes the game engine.
- **GameEngine**: Contains the core game loop and logic for determining winners.
- **TableDrawer**: Draws the game table in the console.

### `players`
- **Player**: Abstract class representing a player.
- **Dealer**: Extends `Player` and implements dealer-specific actions.
- **UserPlayer**: Extends `Player` and implements user-specific actions.
- **PlayerActions**: Interface for player actions like hit, stand, double down, and split.

### Key Topics and Their Implementation
- **Card Management**: Implemented in the `cards` package.
- **Data Handling**: Implemented in the `data` package.
- **Custom Exceptions**: Implemented in the `exceptions` package.
- **Game Logic**: Implemented in the `game` package.
- **Player Actions**: Implemented in the `players` package.
