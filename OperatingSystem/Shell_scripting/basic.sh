#! /bin/bash
# this is a comment, it wont be executed by the script
echo "Hello world" #this is also a comment.There are the most ways used in real world to initialize comments.

# Variables
# there are two types of variable, they are

# System Variable - The variable which is predefined used in unix and linux and these variables are UPPER_CASES.

# User definied variable - The variable which is defined by user, it's case not sensitive.

echo $BASH
echo $BASH_VERSION
echo $HOME
echo $PWD

name=Mark
echo The Name is $name
# variable can be defined with underscore, not with numbers at first of the variable_name

#Inputs from the keyboard.
# read - will get a input from the user.
echo "Enter Your Name"
read name name1 name2
echo "Name1:$name, Name2:$name1, Name3:$name2"

# read -p = allows us to get input in same line.
read -p 'username:' user
echo 'username':$user
# read -sp = allows us to hide the input, which is used for getting user's password.
read -sp 'password:' pwd
echo 'password:' $pwd
# if we need to get many inputs from user and store in array, we can do it.
# read -a array_name = which is a array(a).
# to access we use --> ${array_name[index]}
# read - if get input without any name, it will be stored in REPLY.
echo "Getting inputs in array form!"
read -a arr
echo "Printing the first 2 elements of the array!"
echo ${arr[0]},${arr[1]}
read
echo "without mentioning the variable name, the value will be stored in the REPLY(default) predefined keyword"
echo " the value is $REPLY"

