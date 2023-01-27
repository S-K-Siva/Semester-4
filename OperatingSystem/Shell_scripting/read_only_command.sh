#! /bin/bash

var=31

readonly var
#though we reassign value to the var variable, it won't change, bcz it's readonly variable.


echo "$var"

hello() {
echo "Hello world"
}

readonly -f hello
# -f - flag is used to make function readonly

# we readonly script with only readonly, it will give build-in varaible which are readonly

hello
