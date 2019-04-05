# Java Infix To Postfix Converter And Radix Sort

## Infix To Postfix Convertor
```
Infix: 2 + 51
Postfix: 2 51 +  
```
```
Infix: 9 + 133 - 8
Postfix: 9 133 + 8 -
```
```
Infix: 3 + (2 + 1) * 2^3^2 - 8 / (5 - 1 * 2 / 2)
Postfix: 3 2 1 + 2 3 2 ^ ^ * + 8 5 1 2 * 2 / - / -
```
```
Infix: 23 + (2 + 1) * 24 ^ 3 ^ 2 - 82 / (5 - 1 * 2 / 2)
Postfix: 23 2 1 + 24 3 2 ^ ^ * + 82 5 1 2 * 2 / - / -
```
## Postfix Evaluator  
```
Input: 2 51 +
Result: 53
```
```
Input: 9 133 + 8 -
Result: 134
```
```
Input: 3 2 1 + 2 3 2 ^ ^ * + 8 5 1 2 * 2 / - / -
Result: 1537
```
```
Input: -3 9 *
Result: -27
``` 
## Radix Sort
```
Initial Array: 1000 4 25 319 88 51 3430 8471 701 1 2989 657 713 
Asc Ordered Array: 1 4 25 51 88 319 657 701 713 1000 2989 3430 8471 
Desc Ordered Array: 8471 3430 2989 1000 713 701 657 319 88 51 25 4 1 
```
