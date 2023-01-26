#! /bin/bash

num1=10.5
num2=2

#like arithmetic operations we can't use for floating numbers.
# Here we need to use 'bc' stands for basic calculator(arbirary precision calculator language)

# Syntax : echo "Calculation" | bc.
# Here Calculation acts as argument, which is imported by bc and result is produced.


echo Adding $num1 and $num2 is : 
echo "$num1+$num2" | bc
echo Subtracting $num1 by $num2 : 
echo "$num1-$num2" | bc
echo Multiplication of $num1 and $num2 : 
echo "$num1*$num2" | bc
echo Dividing $num by $num2 : 
echo "scale=2; $num1/$num2" | bc
echo Modulo Operation with $num1 by $num2 :
echo "$num1%$num2" | bc

# scale --> is the number of decimal places we need.
# There are some math operations we can use by '-l' flag.
# '-l' import math library
echo Square root of 25 is : 
echo "scale=2;sqrt(25)" | bc -l
echo "Power of 3^3 is :"
echo "scale=2;3^3" | bc -l

