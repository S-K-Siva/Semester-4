#! /bin/bash
# while loops 

# Syntax
# while [ condition ] 
# do
# 	command1
# 	command2
# 	command3
# done


iter=1

while [ $iter -le 10 ]
do
	echo "$iter"
	iter=$(( iter+1 ))
done

# we can use (( n++ )) also for increment
# we can use (( condition {operator}} )) in while loop.

# if we want to delay the printing the statement we can use sleep command.

echo "priting same output with sleep command"
iter=1
while (( $iter <= 10 ))
do
	echo "$iter"
	(( iter++ ))
	sleep 1
done


# Let's write a while loop to open terminal 2 times

open=0
while (( $open < 2 ))
do
	zsh &
	(( open++ ))
done
