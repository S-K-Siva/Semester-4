#! /bin/bash

commands=('pwd' 'date' 'ls')
for command in ${commands[@]}
do
	echo "******************** ${command}  *********************"
	$command
done

# now lets write a for loop to get all directories of the current working directory
echo "LISTING THE CURRENT WORKING FILES........"
for files in *
do	
	if [ -f $files ]
	then	
		echo $files
	fi
done
