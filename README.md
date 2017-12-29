

A [**Gomoku**](https://en.wikipedia.org/wiki/Gomoku) (Five in a Row) client featuring a powerful AI written in `Java`. Download the latest build [here](target/gomoku-2.0.jar).

There are two main components in this project:

* A strong AI player based on Minimax with α-β pruning, alongside many performance optimisations ([players/ai](src/main/java/players/ai))
* An interface to setup and create new games, created using JavaFX ([gui](src/main/java/gui))
