#! /bin/bash

#Syntax
# case expression in
#	pattern1 )
#		statements ;;
#	pattern2 )
#		statements ;;
#	...
#esac

# case statement is the good alternative for multilevel if statements..

vehicle=$1
# * -> It's equal to default statement like other languages.

case $vehicle in
	"car" )
	echo "This is Car" ;;
	"flight" )
	echo "This is flight" ;;
	"bike" )
	echo "This is bike" ;;
	* )
	echo "This is some type of vechicle" ;;
esac


