#!/bin/bash

# THERE ARE TWO NOTATIONS

# 1) function function_name(){
#	statements
# }

# 2) function_name(){
# 	statements
# }


quit(){
	exit
}


function MyFunction(){
	$1 $2 $3
	echo $1 $2 $3
} 

MyFunction Arg1 Arg2 Arg3
echo "Hello world...."
quit
