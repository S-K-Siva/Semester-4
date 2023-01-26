#! /bin/bash

echo -e "Enter some character :\c"
read character
# for regular expression, go to wikipedia page and get more knowledge about patterns which is also called regular expressions.
# ? --> used for special character.
# NOTE : When you give input Upper Case and It result outputs the lowercase one, then 
#	You need to use some trick to rectify it, go to terminal -> write command "LANG=C"
#	LANG stands for Language/localate and C stands for Language.
case $character in 
	[a-z] )
	echo "You have entered Lower case alphabet" ;;
	[A-Z] )
	echo "You have entered Upper case alphabet" ;;
	[0-9] )
	echo "You have entered Number" ;;
	? )
	echo "Some special character" ;;
	* ) 
	echo "Unknown input" ;;
esac 
