#! /bin/bash
# until loops.

n=1

# until loops is opposite to while loop, the statements are executed if the condition is false
until [ $n -gt 10 ]
do
	echo $n
	(( n++ ))
done
