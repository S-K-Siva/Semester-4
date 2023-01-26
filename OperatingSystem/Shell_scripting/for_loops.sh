#! /bin/bash

# for loops

# syntax
# for VARIABLE in 1 2 3 4 5 .. N
#do
#	statements
#done

# ANOTHER USE CASE 

# for VARIABLE in file1 file2 file3
#do
#	statements
#done

# ANOTHER USE CASE

# for OUTPUT in $(Linux-Or-Unix-Command-Here)
#do
#	statements
#done

# ANOTHER USE CASE

# for (( EXP1; EXP2; EXP3 ))
#do
#	statements
#done

#Syntax (This can be use in the version of bash atleast 4)
# for iter in {start..end..increment}
# do
#	echo %iter
# done
for num in {1..5}
do
	echo $num
done

echo My Bash version "${BASH_VERSION}"

for ((i=0; i<5; i++ ))
do
	echo $i
done
