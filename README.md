# Computewall
Program to find a special solution to a mathematical problem called "Zahlenmauer" which is german and translates roughly to
`number-wall`. 

So what is the actual problem?

Imagine as an example the following structure:

````
        |_0_|
      |_0_|_0_|
    |_0_|_0_|_0_|
  |_0_|_0_|_0_|_0_|
| 0 | 0 | 0 | 0 | 0 |
````

Where the number `0` stands for any number which can be calculated by adding/subtracting/multiplying/dividing two
numbers below your choosen number. The numbers in the bottom row can be choosen to your liking.

The difficulty is choosen by the one who is replacing the zeros in the puzzle and choosing the arithmetic operation. The bottom row can have any amount of
numbers where the operation `%2` doesn't return zero, so any odd number.
