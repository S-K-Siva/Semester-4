#! /bin/bash

# shell script accepts simple one dimensional array.

os=('MacOs' 'Windows' 'Linux')

echo "${os[@]}"

# to print the index of the array use ${ !array_name[@] }
echo "${!os[@]}"

# to add elements we can add like below
os[3]='Ubuntu-Linux'
echo "${os[@]}"

# to delete the element we can use the below syntax to do so.
# unset array_name[index]
unset os[2]
echo "After deleting the 2nd index value of the array, the array elements are.."
echo "${os[@]}"
echo "The length of the array is : ${#os[@]}"
