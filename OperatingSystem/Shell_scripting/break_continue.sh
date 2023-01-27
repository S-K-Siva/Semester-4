#! /bin/bash

for (( i=1 ; i<=10 ; i++ ))
do
	if [ $i -gt 5 ] 
	then
		break
	fi
	echo "$i"
done

# CONTINUE STATEMENT

for (( i=1 ; i<=10 ; i++ ))
do
	if [ $i -eq 5 -o $i -eq 7 ]
	then
		continue
	fi
	echo "$i"
done
