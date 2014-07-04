### Game of life

Game of life is a simulation of cellular automaton life, based on few simple rules

The World in game of life consists of a grid of cells. Every cell interacts with its eight neighbours, which are the cells that are horizontally, vertically, or diagonally adjacent.

#### Rules

At each step in time, the following transitions occur:

1. Any live cell with fewer than two live neighbours dies, as if caused by under-population.
2. Any live cell with two or three live neighbours lives on to the next generation.
3. Any live cell with more than three live neighbours dies, as if by overcrowding.
4. Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.

The initial pattern is the seed of the system.

With each tick or generation, the above rules are applied simultaneously to every cell - births and deaths occur simultaneously.

For more details, see this [wiki link for Game of life](http://en.wikipedia.org/wiki/Conway's_Game_of_Life)

#### Problem statement

With an initial pattern as input, simulate game of life for each clock tick:

Example 1: Oscillator

T=1
```
.....
..*..
..*..
..*..
.....
```

T=1
```
.....
.....
.***.
.....
.....
```

T=2
```
.....
..*..
..*..
..*..
.....
```

Example 2: Stilllife - Beehive

T=0
```
......
..**..
.*..*.
..**..
......
```

T=1
```
......
..**..
.*..*.
..**..
......
```

T=2
```
......
..**..
.*..*.
..**..
......
```

For more patterns, see wiki link above.

#### 4 Rules of simple design

Keep the following design principles in mind, when implementing your solution.

1. Passes all tests
2. Expresses intent
3. No duplication - Don't Repeat Yourself (DRY)
4. Minimizes number of classes and methods