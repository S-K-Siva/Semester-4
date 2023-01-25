#! /bin/bash

num1=100
num2=10
# we should use double bracket
# addition = $(( num1 + num2 ))
# we can use subtraction, Multiplication, Division, Modulous Operation.
# Simple Syntax:
#	$(( operand1 {operator} operand2 )) 


echo "The addition of $num1 and $num2 is  $(( num1 + num2 ))"
echo "The subtraction of $num1 and $num2 is $(( num1 - num2 ))"
echo "The multiplication of $num1 and $num2 is $(( num1 * num2 ))"
echo "The Division of $num1 and $num2 is $(( num1 / num2 ))"
echo "The Modulo Operation of $num1 by $num2 is $(( num1 % num2 ))"


# To do arithmetic operations we have expr command.
# By using 'expr' keyword with single paranthesis on both sides.
# When we use expr command, for multiplication, we need to use '\*' to do so.
echo "Using 'expr keyword' .. doing the same operation below..."
echo "The addition of $num1 and $num2 is  $(expr $num1 + $num2 )"
echo "The subtraction of $num1 and $num2 is $(expr $num1 - $num2 )"
echo "The multiplication of $num1 and $num2 is $(expr $num1 \* $num2 )"
echo "The Division of $num1 and $num2 is $(expr $num1 / $num2 )"
echo "The Modulo Operation of $num1 by $num2 is $(expr $num1 % $num2 )"
