#! /bin/bash

# select loop is used when we require menu's.

# Menu means..
# 1) obj1
# 2) obj2
# 3) obj3

# select loop it will give some menu structure like above.
# then we can select using the menu.
# select menu is mostly used in case

# Syntax:
# select varName in list
# do
# 	command1
# 	command2
# 	....
# 	.....
#	command n
# done 

select name in person1 person2 person3 person4
do
	case $name in
	person1)
		echo person1 selected;;
	person2)	
		echo person2 selected;;
	person3)
		echo person3 selected;;
	person4)
		echo person4 selected;;
	*)
		echo "Invalid input, Enter the valid number between 1..4"
	esac
done

