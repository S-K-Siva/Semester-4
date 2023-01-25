#! /bin/bash

# There are two ways to use AND operator in shell script
# 1. Using && operator(AND) like programming language.
#	Syntax: if [condition] && [condition] 
# 2. We can use '-a' flag , which stands for AND Operator.
# 3. It works for double square brackets too.. Syntax : if [[condition -a condition1]] 


MyRank=1

if [ "$MyRank" -eq 1 ] && [ "$MyRank" -lt 3 ]
then 
	echo "You are Head of the table"
else
	echo "You are not in the Head of the table"
fi

if [ "$MyRank" = 1 -a "$MyRank" > 0 ]
then
	echo "I'm Number 1, Greatest Of All Time"
else
	echo "I'm below the Greatest Rank."
fi

