#!/bin/bash
echo -n "Enter Number:"
read number
result=1
for (( i=3; i<$number; i++ ))
do
	if [[ `expr $number % $i` == 0 ]]
	then
		result=0
		break
	fi
done

if [[ $result == 1 ]]
then
	echo "The number $number is Prime Number"
else
	echo "The number $number is not Prime Number"
fi
	
