#! /bin/bash

# Like AND Operator we can use flat '-o' for OR operation.
# we can use double bracket with double brackets too.

MyRank=1
if [ "$MyRank" -eq 1 ] || [ "$MyRank" -lt 3 ]
then
	echo "I'm greatest of all time kid"
else
	echo "I'm below the rank"
fi

if [ "$MyRank" -eq 1 -o "$MyRank" -gt 0 ] 
then 
	echo "I'm Number 1"
else
	echo "I'm Below the rank"
fi


