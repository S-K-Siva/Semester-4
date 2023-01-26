#! /bin/bash

echo "FIRST WAY TO READ THE FILE"
while read p
do 
	echo $p
done < 'file_reading.sh'

echo "SECOND WAY TO READ THE FILE"
#using cat command

cat $1 | while read line
do
	echo $line
done


# IFS - Internal Feel Seperator.
# -r - used to igonore backslash stuffs. Its one of the flags used with IFS.

echo "THIRD WAY TO READ THE FILE"

while IFS= read -r line
do
	echo $line
done < $1

# we can use file descriptors, where we can read file, it's another way to do so.
