#!/bin/bash
num1=$1
num2=$2
num3=$3
if [[ $num1 -gt $num2 && $num1 -gt $num3 ]]
then
	echo "$num1 is greatest of all three numbers"
elif [[ $num2 -gt $num1 && $num3 -gt $num2 ]]
then
	echo "$num2 is greatest of all three numbers"
else
	echo "$num3 is greatest of all three numbers"
fi
