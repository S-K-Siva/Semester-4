#! /bin/bash
# to pass argument by default we need to use numbers.
# $0 -> gives script name
# the argument(user-given) starts from variable 1 and so on..
# below is the syntax "> echo .."

echo $1 $2 " > echo Hello,$1 . Your age is $2"
# $@ -> it stores the arguments as array.
args=("$@")
echo the array values are..
echo ${args[0]} , ${args[1]}

# to print all the argument at once.
echo printing all argument at once.
echo $@

# to know the number of argument passed into script.
echo printing total argument count passed.
echo Total argument passed $#
