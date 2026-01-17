# Pong FXGL

A classic Pong game implementation built with FXGL (JavaFX Game Library).

## Description

This is a two-player Pong game featuring:
- Player vs AI gameplay
- Score tracking (first to 11 wins)
- Physics-based ball movement and collisions
- Clean, retro-style graphics with a blue background

## Requirements

- Java 25
- Maven 3.x
- FXGL 21.1

## Project Structure

```
pong/
├── src/
│   └── main/
│       ├── java/
│       │   └── pro/davidvazquez/fxgl/pong/
│       │       ├── PongApp.java          # Main application class
│       │       ├── PongFactory.java      # Entity factory
│       │       ├── BallComponent.java    # Ball behavior
│       │       ├── BatComponent.java     # Player bat behavior
│       │       ├── EnemyBatComponent.java # AI bat behavior
│       │       └── EntityType.java       # Entity type definitions
│       └── resources/
├── pom.xml
└── README.md
```

## Building the Project

```bash
mvn clean compile
```

## Running the Game

```bash
mvn exec:java -Dexec.mainClass="pro.davidvazquez.fxgl.pong.PongApp"
```

Or run the main class directly from your IDE:
```
pro.davidvazquez.fxgl.pong.PongApp
```

## How to Play

### Controls
- **W** - Move player bat up
- **S** - Move player bat down

### Rules
- The left bat (Player 1) is controlled by the player
- The right bat (Player 2) is controlled by AI
- Score points when the ball passes your opponent's bat
- First player to reach 11 points wins
- The ball resets to the center after each score

## Game Components

### PongApp
The main application class that initializes the game, sets up input controls, manages game state, and handles UI rendering.

### BallComponent
Controls ball physics and movement, including velocity and collision behavior.

### BatComponent
Manages player-controlled bat movement (up and down).

### EnemyBatComponent
Implements AI logic for the computer-controlled opponent bat.

### PongFactory
Factory class responsible for spawning game entities (ball, bats, and walls).

## Dependencies

This project uses FXGL 21.1, a comprehensive JavaFX game development framework that provides:
- Entity-component system
- Physics engine
- Input handling
- Collision detection
- UI utilities

## Resources

This project was developed following concepts from **"Learn JavaFX Game and App Development"** by Almas Baimagambetov, which provides comprehensive guidance on building games and applications with JavaFX and FXGL.

## License

This is a learning project demonstrating FXGL game development capabilities.

## Author

David Vazquez
