#!/bin/bash
sum=0
len=$#
while (( $# ))
do
	sum=$((sum+$1))
	shift
done
echo "Length : $len"
echo "Sum : $sum"
echo "The average is $((sum/len))"
